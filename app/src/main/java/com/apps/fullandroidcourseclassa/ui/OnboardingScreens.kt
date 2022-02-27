package com.apps.fullandroidcourseclassa.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.apps.fullandroidcourseclassa.R
import com.apps.fullandroidcourseclassa.adapters.OnBoardingScreensItemAdapter
import com.apps.fullandroidcourseclassa.data.OnBoardingScreensItem
import kotlinx.android.synthetic.main.activity_onboarding_screens.*

class OnboardingScreens : AppCompatActivity() {
    private lateinit var onBoardingScreensItemAdapter: OnBoardingScreensItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screens)
        setupOnBoardingScreenItem()
    }

    private fun setupOnBoardingScreenItem() {
        onBoardingScreensItemAdapter = OnBoardingScreensItemAdapter(
            listOf(
                OnBoardingScreensItem(
                    onBoardingScreensImage = R.drawable.onboardingone,
                    title = "PAY EASY",
                    description = "You can now buy in simple way using your credit card."
                ),
                OnBoardingScreensItem(
                    onBoardingScreensImage = R.drawable.onboardingtwo,
                    title = "XD - UnDraw Plugin",
                    description = "You can now use unDraw Plugin at our XD Application."
                ),
                OnBoardingScreensItem(
                    onBoardingScreensImage = R.drawable.onboardingthree,
                    title = "UI UX Helper",
                    description = "With our UI UX Helper you can organize your app look and make it easy to use"
                ),
            )
        )
        onBoardingViewPager.adapter = onBoardingScreensItemAdapter
    }

    private fun setupIndicators(){

    }
}