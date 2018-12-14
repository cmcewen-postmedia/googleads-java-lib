// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201710.basicoperations;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupStatus;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201710.cm.Bids;
import com.google.api.ads.adwords.axis.v201710.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201710.cm.Money;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import javax.annotation.Nullable;

/**
 * This example updates the CPC bid and status for a given ad group. To get ad groups, run
 * GetAdGroups.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateAdGroup {

  private static class UpdateAdGroupParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
    @Parameter(names = ArgumentNames.CPC_BID_MICRO_AMOUNT)
    private Long cpcBidMicroAmount;
  }

  public static void main(String[] args) {
    AdWordsSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();

      // Construct an AdWordsSession.
      session =
          new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    UpdateAdGroupParams params = new UpdateAdGroupParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      // Set this to null if you do not want to update the CPC bid.
      params.cpcBidMicroAmount = Long.parseLong("INSERT_CPC_BID_MICRO_AMOUNT_HERE");
    }

    try {
      runExample(adWordsServices, session, params.adGroupId, params.cpcBidMicroAmount);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf(
          "Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @param adGroupId the ID of the ad group to update.
   * @param bidMicroAmount the optional bid amount in micros to use for the ad group bid.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      Long adGroupId,
      @Nullable Long bidMicroAmount)
      throws RemoteException {
    // Get the AdGroupService.
    AdGroupServiceInterface adGroupService =
        adWordsServices.get(session, AdGroupServiceInterface.class);

    // Create an ad group with the specified ID.
    AdGroup adGroup = new AdGroup();
    adGroup.setId(adGroupId);
    // Update the CPC bid if specified.
    if (bidMicroAmount != null) {
      BiddingStrategyConfiguration biddingStrategyConfiguration =
          new BiddingStrategyConfiguration();
      Money cpcBidMoney = new Money();
      cpcBidMoney.setMicroAmount(bidMicroAmount);
      CpcBid cpcBid = new CpcBid();
      cpcBid.setBid(cpcBidMoney);
      biddingStrategyConfiguration.setBids(new Bids[] {cpcBid});
      adGroup.setBiddingStrategyConfiguration(biddingStrategyConfiguration);
    }
    // Pause the ad group.
    adGroup.setStatus(AdGroupStatus.PAUSED);

    // Create operations.
    AdGroupOperation operation = new AdGroupOperation();
    operation.setOperand(adGroup);
    operation.setOperator(Operator.SET);

    AdGroupOperation[] operations = new AdGroupOperation[] {operation};

    // Update ad group.
    AdGroupReturnValue result = adGroupService.mutate(operations);

    // Display ad groups.
    for (AdGroup adGroupResult : result.getValue()) {
      BiddingStrategyConfiguration biddingStrategyConfiguration =
          adGroupResult.getBiddingStrategyConfiguration();
      // Find the CpcBid in the bidding strategy configuration's bids collection.
      Long cpcBidMicros = null;
      if (biddingStrategyConfiguration != null) {
        if (biddingStrategyConfiguration.getBids() != null) {
          for (Bids bid : biddingStrategyConfiguration.getBids()) {
            if (bid instanceof CpcBid) {
              cpcBidMicros = ((CpcBid) bid).getBid().getMicroAmount();
              break;
            }
          }
        }
      }
      System.out.printf(
          "Ad group with ID %d and name '%s' updated to have status '%s' and CPC bid %d%n",
          adGroupResult.getId(), adGroupResult.getName(), adGroupResult.getStatus(), cpcBidMicros);
    }
  }
}
