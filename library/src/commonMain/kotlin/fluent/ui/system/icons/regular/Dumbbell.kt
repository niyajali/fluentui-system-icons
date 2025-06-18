/**
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.Dumbbell: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Dumbbell",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.766f, 7.802f)
            curveTo(18.059f, 8.095f, 18.059f, 8.57f, 17.766f, 8.863f)
            curveTo(17.473f, 9.156f, 16.998f, 9.156f, 16.705f, 8.863f)
            lineTo(15.135f, 7.293f)
            curveTo(14.842f, 7f, 14.842f, 6.525f, 15.135f, 6.233f)
            curveTo(15.428f, 5.94f, 15.903f, 5.94f, 16.196f, 6.233f)
            lineTo(17.766f, 7.802f)
            close()
            moveTo(9.393f, 17.235f)
            curveTo(9.686f, 16.942f, 9.686f, 16.468f, 9.393f, 16.175f)
            lineTo(7.823f, 14.605f)
            curveTo(7.531f, 14.312f, 7.056f, 14.312f, 6.763f, 14.605f)
            curveTo(6.47f, 14.898f, 6.47f, 15.373f, 6.763f, 15.666f)
            lineTo(8.333f, 17.235f)
            curveTo(8.625f, 17.528f, 9.1f, 17.528f, 9.393f, 17.235f)
            close()
            moveTo(20.937f, 3.084f)
            curveTo(20.179f, 2.326f, 18.949f, 2.326f, 18.191f, 3.084f)
            lineTo(17.521f, 3.755f)
            lineTo(17.313f, 3.548f)
            curveTo(16.371f, 2.605f, 14.843f, 2.605f, 13.901f, 3.548f)
            curveTo(13.809f, 3.639f, 13.726f, 3.737f, 13.652f, 3.839f)
            curveTo(12.734f, 3.669f, 11.75f, 3.939f, 11.039f, 4.65f)
            curveTo(9.893f, 5.796f, 9.893f, 7.656f, 11.039f, 8.802f)
            lineTo(11.756f, 9.519f)
            lineTo(9.517f, 11.758f)
            lineTo(8.8f, 11.041f)
            curveTo(7.653f, 9.895f, 5.794f, 9.895f, 4.648f, 11.041f)
            curveTo(3.937f, 11.752f, 3.667f, 12.736f, 3.837f, 13.654f)
            curveTo(3.735f, 13.728f, 3.637f, 13.811f, 3.546f, 13.903f)
            curveTo(2.603f, 14.845f, 2.603f, 16.373f, 3.546f, 17.315f)
            lineTo(3.753f, 17.523f)
            lineTo(3.061f, 18.215f)
            curveTo(2.303f, 18.973f, 2.303f, 20.202f, 3.061f, 20.96f)
            curveTo(3.819f, 21.718f, 5.048f, 21.718f, 5.806f, 20.96f)
            lineTo(6.498f, 20.268f)
            lineTo(6.706f, 20.475f)
            curveTo(7.648f, 21.418f, 9.176f, 21.418f, 10.118f, 20.475f)
            curveTo(10.21f, 20.384f, 10.293f, 20.286f, 10.367f, 20.184f)
            curveTo(11.285f, 20.354f, 12.269f, 20.084f, 12.98f, 19.373f)
            curveTo(14.126f, 18.227f, 14.126f, 16.368f, 12.98f, 15.221f)
            lineTo(12.262f, 14.504f)
            lineTo(14.502f, 12.265f)
            lineTo(15.219f, 12.982f)
            curveTo(16.365f, 14.128f, 18.225f, 14.128f, 19.371f, 12.982f)
            curveTo(20.082f, 12.271f, 20.352f, 11.287f, 20.182f, 10.369f)
            curveTo(20.284f, 10.295f, 20.382f, 10.212f, 20.473f, 10.12f)
            curveTo(21.416f, 9.178f, 21.416f, 7.65f, 20.473f, 6.708f)
            lineTo(20.266f, 6.5f)
            lineTo(20.937f, 5.83f)
            curveTo(21.695f, 5.071f, 21.695f, 3.842f, 20.937f, 3.084f)
            close()
            moveTo(19.205f, 5.44f)
            lineTo(18.581f, 4.816f)
            lineTo(19.252f, 4.145f)
            curveTo(19.424f, 3.973f, 19.704f, 3.973f, 19.876f, 4.145f)
            curveTo(20.048f, 4.317f, 20.048f, 4.597f, 19.876f, 4.769f)
            lineTo(19.205f, 5.44f)
            close()
            moveTo(13.441f, 11.204f)
            lineTo(11.202f, 13.443f)
            lineTo(10.578f, 12.819f)
            lineTo(12.817f, 10.58f)
            lineTo(13.441f, 11.204f)
            close()
            moveTo(5.438f, 19.207f)
            lineTo(4.745f, 19.899f)
            curveTo(4.573f, 20.072f, 4.294f, 20.072f, 4.121f, 19.899f)
            curveTo(3.949f, 19.727f, 3.949f, 19.448f, 4.121f, 19.275f)
            lineTo(4.814f, 18.583f)
            lineTo(5.438f, 19.207f)
            close()
            moveTo(14.961f, 4.608f)
            curveTo(15.318f, 4.252f, 15.896f, 4.252f, 16.253f, 4.608f)
            lineTo(19.413f, 7.768f)
            curveTo(19.769f, 8.125f, 19.769f, 8.703f, 19.413f, 9.06f)
            curveTo(19.306f, 9.166f, 19.182f, 9.239f, 19.051f, 9.282f)
            curveTo(18.848f, 9.348f, 18.682f, 9.498f, 18.596f, 9.694f)
            curveTo(18.51f, 9.89f, 18.512f, 10.113f, 18.601f, 10.307f)
            curveTo(18.844f, 10.838f, 18.746f, 11.486f, 18.311f, 11.921f)
            curveTo(17.75f, 12.482f, 16.84f, 12.482f, 16.279f, 11.921f)
            lineTo(12.1f, 7.742f)
            curveTo(11.539f, 7.181f, 11.539f, 6.271f, 12.1f, 5.71f)
            curveTo(12.535f, 5.275f, 13.182f, 5.177f, 13.714f, 5.42f)
            curveTo(13.908f, 5.509f, 14.131f, 5.51f, 14.327f, 5.424f)
            curveTo(14.523f, 5.339f, 14.673f, 5.173f, 14.739f, 4.97f)
            curveTo(14.782f, 4.838f, 14.855f, 4.715f, 14.961f, 4.608f)
            close()
            moveTo(5.708f, 12.102f)
            curveTo(6.269f, 11.541f, 7.178f, 11.541f, 7.739f, 12.102f)
            lineTo(11.919f, 16.281f)
            curveTo(12.48f, 16.842f, 12.48f, 17.752f, 11.919f, 18.313f)
            curveTo(11.483f, 18.748f, 10.836f, 18.847f, 10.305f, 18.603f)
            curveTo(10.111f, 18.514f, 9.888f, 18.513f, 9.692f, 18.598f)
            curveTo(9.496f, 18.684f, 9.346f, 18.85f, 9.28f, 19.053f)
            curveTo(9.237f, 19.184f, 9.164f, 19.309f, 9.057f, 19.415f)
            curveTo(8.701f, 19.771f, 8.123f, 19.771f, 7.766f, 19.415f)
            lineTo(4.606f, 16.255f)
            curveTo(4.25f, 15.898f, 4.25f, 15.32f, 4.606f, 14.964f)
            curveTo(4.712f, 14.857f, 4.836f, 14.784f, 4.968f, 14.741f)
            curveTo(5.171f, 14.675f, 5.336f, 14.525f, 5.422f, 14.329f)
            curveTo(5.508f, 14.133f, 5.506f, 13.91f, 5.417f, 13.716f)
            curveTo(5.174f, 13.185f, 5.273f, 12.537f, 5.708f, 12.102f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DumbbellPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Dumbbell, contentDescription = null)
    }
}
