// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Footholdtech.Fivetran.Inputs
{

    public sealed class ConnectorAuthClientAccessGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Field usage depends on `service` value: 
        /// 	- Service `adroll`: `Client ID` of your AdRoll client application.
        /// 	- Service `airtable`: `Client ID` of your Airtable client application.
        /// 	- Service `amazon_ads`: `Client ID` of your Amazon Ads client application.
        /// 	- Service `asana`: `Client ID` of your Asana client application.
        /// 	- Service `azure_service_bus`: `Client ID` of your Azure application. Required if the authentication type is `AzureActiveDirectory`
        /// 	- Service `bingads`: `Client ID` of your Microsoft Advertising client application.
        /// 	- Service `business_central`: `Client ID` of your Airtable client application.
        /// 	- Service `double_click_campaign_manager`: `Client ID` of your Google Campaign Manager 360 client application.
        /// 	- Service `double_click_publishers`: `Client ID` of your Google Ad Manager client application.
        /// 	- Service `dropbox`: `Client ID` of your Dropbox client application.
        /// 	- Service `dynamics_365`: `Client ID` of your Dynamic 365 client application, or Service Principal.
        /// 	- Service `facebook_ads`: `Client ID` of your Facebook client application.
        /// 	- Service `facebook_pages`: `Client ID` of your Facebook  client application.
        /// 	- Service `financial_force`: `Client ID` of your Salesforce client application.
        /// 	- Service `front`: `Client ID` of your Front client application.
        /// 	- Service `google_ads`: `Client ID` of your Google Ads client application.
        /// 	- Service `google_analytics`: `Client ID` of your Google Analytics client application.
        /// 	- Service `google_analytics_4`: `Client ID` of your Google Analytics client application.
        /// 	- Service `google_analytics_mcf`: `Client ID` of your Google Analytics client application.
        /// 	- Service `google_display_and_video_360`: `Client ID` of your Google Display &amp; Video 360 client application.
        /// 	- Service `google_play`: `Client ID` of your Google Play client application.
        /// 	- Service `google_search_ads_360`: `Client ID` of your Google Search Ads 360 client application.
        /// 	- Service `google_search_console`: `Client ID` of your Google Search Console client application.
        /// 	- Service `google_sheets`: `Client ID` of your Google Sheets client application.
        /// 	- Service `helpscout`: `Client ID` of your Help Scout client application.
        /// 	- Service `hubspot`: `Client ID` of your HubSpot client application.
        /// 	- Service `instagram_business`: `Client ID` of your Facebook  client application.
        /// 	- Service `linkedin_ads`: `Client ID` of your LinkedIn client application.
        /// 	- Service `linkedin_company_pages`: `Client ID` of your LinkedIn client application.
        /// 	- Service `microsoft_lists`: `Client ID` of your Microsoft client application.
        /// 	- Service `one_drive`: `Client ID` of your Microsoft OneDrive client application.
        /// 	- Service `optimizely`: `Client ID` of your Optimizely client application.
        /// 	- Service `outreach`: `Client ID` of your Outreach client application.
        /// 	- Service `pardot`: `Client ID` of your Pardot client application.
        /// 	- Service `pinterest_ads`: `Client ID` of your Pinterest client application.
        /// 	- Service `pipedrive`: `Client ID` of your Pipedrive client application.
        /// 	- Service `qualtrics`: `Client ID` of your Qualtrics client application.
        /// 	- Service `quickbooks`: `Client ID` of your QuickBooks client application.
        /// 	- Service `reddit_ads`: `Client ID` of your Reddit Ads client application.
        /// 	- Service `salesforce`: `Client ID` of your Salesforce client application.
        /// 	- Service `salesforce_sandbox`: `Client ID` of your Salesforce client application.
        /// 	- Service `share_point`: `Client ID` of your Microsoft client application.
        /// 	- Service `snapchat_ads`: `Client ID` of your Snapchat Ads client application.
        /// 	- Service `spotify_ads`: `Client ID` of your Ad Studio application.
        /// 	- Service `survey_monkey`: `Client ID` of your SurveyMonkey client application.
        /// 	- Service `tiktok_ads`: `Client ID` of your TikTok Ads client application.
        /// 	- Service `twitter`: `Client ID` of your Twitter client application.
        /// 	- Service `twitter_ads`: `Client ID` of your Twitter Ads client application.
        /// 	- Service `typeform`: The Typeform client ID.
        /// 	- Service `yahoo_gemini`: `Client ID` of your Yahoo Gemini client application.
        /// 	- Service `youtube_analytics`: `Client ID` of your Youtube client application.
        /// 	- Service `zoho_crm`: `Client ID` of your Zoho client application.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientSecret")]
        private Input<string>? _clientSecret;

        /// <summary>
        /// Field usage depends on `service` value: 
        /// 	- Service `adroll`: `Client Secret` of your AdRoll client application.
        /// 	- Service `airtable`: `Client Secret` of your Airtable client application.
        /// 	- Service `amazon_ads`: `Client Secret` of your Amazon Ads client application.
        /// 	- Service `asana`: `Client Secret` of your Asana client application.
        /// 	- Service `azure_service_bus`: `Client Secret` of your Azure application. Required if the authentication type is `AzureActiveDirectory`
        /// 	- Service `bingads`: `Client Secret` of your Microsoft Advertising client application.
        /// 	- Service `business_central`: `Client Secret` of your Airtable client application.
        /// 	- Service `double_click_campaign_manager`: `Client Secret` of your Google Campaign Manager 360 client application.
        /// 	- Service `double_click_publishers`: `Client Secret` of your Google Ad Manager client application.
        /// 	- Service `dropbox`: `Client Secret` of your Dropbox client application.
        /// 	- Service `dynamics_365`: `Client Secret` of your Dynamic 365 client application, or Service Principal.
        /// 	- Service `facebook_ads`: `Client Secret` of your Facebook client application.
        /// 	- Service `facebook_pages`: `Client Secret` of your Facebook client application.
        /// 	- Service `financial_force`: `Client Secret` of your Salesforce client application.
        /// 	- Service `front`: `Client Secret` of your Front client application.
        /// 	- Service `google_ads`: `Client Secret` of your Google Ads client application.
        /// 	- Service `google_analytics`: `Client Secret` of your Google Analytics client application.
        /// 	- Service `google_analytics_4`: `Client Secret` of your Google Analytics client application.
        /// 	- Service `google_analytics_mcf`: `Client Secret` of your Google Analytics client application.
        /// 	- Service `google_display_and_video_360`: `Client Secret` of your Google Display &amp; Video 360 client application.
        /// 	- Service `google_play`: `Client Secret` of your Google Play client application.
        /// 	- Service `google_search_ads_360`: `Client Secret` of your Google Search Ads 360 client application.
        /// 	- Service `google_search_console`: `Client Secret` of your Google Search Console client application.
        /// 	- Service `google_sheets`: `Client Secret` of your Google Sheets client application.
        /// 	- Service `helpscout`: `Client Secret` of your Help Scout client application.
        /// 	- Service `hubspot`: `Client Secret` of your HubSpot client application.
        /// 	- Service `instagram_business`: `Client Secret` of your Facebook client application.
        /// 	- Service `linkedin_ads`: `Client Secret` of your LinkedIn client application.
        /// 	- Service `linkedin_company_pages`: `Client Secret` of your LinkedIn client application.
        /// 	- Service `microsoft_lists`: `Client Secret` of your Microsoft client application.
        /// 	- Service `one_drive`: `Client Secret` of your Microsoft OneDrive client application.
        /// 	- Service `optimizely`: `Client Secret` of your Optimizely client application.
        /// 	- Service `outreach`: `Client Secret` of your Outreach client application.
        /// 	- Service `pardot`: `Client Secret` of your Pardot client application.
        /// 	- Service `pinterest_ads`: `Client Secret` of your Pinterest client application.
        /// 	- Service `pipedrive`: `Client Secret` of your Pipedrive client application.
        /// 	- Service `qualtrics`: `Client Secret` of your Qualtrics client application.
        /// 	- Service `quickbooks`: `Client Secret` of your QuickBooks client application.
        /// 	- Service `reddit_ads`: `Client Secret` of your Reddit Ads client application.
        /// 	- Service `salesforce`: `Client Secret` of your Salesforce client application.
        /// 	- Service `salesforce_sandbox`: `Client Secret` of your Salesforce client application.
        /// 	- Service `share_point`: `Client Secret` of your Microsoft client application.
        /// 	- Service `snapchat_ads`: `Client Secret` of your Snapchat Ads client application.
        /// 	- Service `spotify_ads`: `Client Secret` of your Ad Studio application.
        /// 	- Service `survey_monkey`: `Client Secret` of your SurveyMonkey client application.
        /// 	- Service `tiktok_ads`: `Client Secret` of your TikTok Ads client application.
        /// 	- Service `twitter`: `Client Secret` of your Twitter client application.
        /// 	- Service `twitter_ads`: `Client Secret` of your Twitter Ads client application.
        /// 	- Service `typeform`: The Typeform client secret.
        /// 	- Service `yahoo_gemini`: `Client Secret` of your Yahoo Gemini client application.
        /// 	- Service `youtube_analytics`: `Client Secret` of your Youtube client application.
        /// 	- Service `zoho_crm`: `Client Secret` of your Zoho client application.
        /// </summary>
        public Input<string>? ClientSecret
        {
            get => _clientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Field usage depends on `service` value: 
        /// 	- Service `google_ads`: Your approved `Developer token` to connect to the Google Ads API.
        /// </summary>
        [Input("developerToken")]
        public Input<string>? DeveloperToken { get; set; }

        /// <summary>
        /// Field usage depends on `service` value: 
        /// 	- Service `google_ads`: Your company's name in your Google Ads client application.
        /// </summary>
        [Input("userAgent")]
        public Input<string>? UserAgent { get; set; }

        public ConnectorAuthClientAccessGetArgs()
        {
        }
        public static new ConnectorAuthClientAccessGetArgs Empty => new ConnectorAuthClientAccessGetArgs();
    }
}
