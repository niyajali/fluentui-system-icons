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

public val FluentUi.Regular.BoxArrowUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BoxArrowUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.591f, 2.513f)
            curveTo(11.495f, 2.147f, 12.505f, 2.147f, 13.409f, 2.513f)
            lineTo(20.907f, 5.553f)
            curveTo(21.568f, 5.821f, 22f, 6.462f, 22f, 7.175f)
            verticalLineTo(12.811f)
            curveTo(21.556f, 12.384f, 21.051f, 12.02f, 20.5f, 11.733f)
            verticalLineTo(7.773f)
            lineTo(12.75f, 10.765f)
            verticalLineTo(13.064f)
            curveTo(12.058f, 13.804f, 11.537f, 14.707f, 11.25f, 15.708f)
            verticalLineTo(10.764f)
            lineTo(3.5f, 7.75f)
            verticalLineTo(16.827f)
            curveTo(3.5f, 16.929f, 3.562f, 17.021f, 3.656f, 17.059f)
            lineTo(11.155f, 20.099f)
            curveTo(11.186f, 20.112f, 11.218f, 20.124f, 11.25f, 20.135f)
            verticalLineTo(20.134f)
            lineTo(11.439f, 20.211f)
            curveTo(11.498f, 20.235f, 11.557f, 20.255f, 11.618f, 20.271f)
            curveTo(11.866f, 20.797f, 12.183f, 21.285f, 12.557f, 21.722f)
            curveTo(11.898f, 21.821f, 11.219f, 21.744f, 10.591f, 21.489f)
            lineTo(3.093f, 18.449f)
            curveTo(2.432f, 18.181f, 2f, 17.54f, 2f, 16.827f)
            verticalLineTo(7.175f)
            curveTo(2f, 6.462f, 2.432f, 5.821f, 3.093f, 5.553f)
            lineTo(10.591f, 2.513f)
            close()
            moveTo(12.845f, 3.903f)
            curveTo(12.303f, 3.683f, 11.697f, 3.683f, 11.155f, 3.903f)
            lineTo(9.241f, 4.679f)
            lineTo(16.768f, 7.606f)
            lineTo(19.437f, 6.576f)
            lineTo(12.845f, 3.903f)
            close()
            moveTo(4.59f, 6.564f)
            lineTo(12.001f, 9.447f)
            lineTo(14.692f, 8.408f)
            lineTo(7.215f, 5.5f)
            lineTo(4.59f, 6.564f)
            close()
            moveTo(23f, 17.501f)
            curveTo(23f, 14.463f, 20.538f, 12.001f, 17.5f, 12.001f)
            curveTo(14.462f, 12.001f, 12f, 14.463f, 12f, 17.501f)
            curveTo(12f, 20.538f, 14.462f, 23.001f, 17.5f, 23.001f)
            curveTo(20.538f, 23.001f, 23f, 20.538f, 23f, 17.501f)
            close()
            moveTo(17.542f, 14.003f)
            lineTo(17.628f, 14.018f)
            lineTo(17.691f, 14.039f)
            lineTo(17.758f, 14.073f)
            lineTo(17.806f, 14.105f)
            lineTo(20.354f, 16.647f)
            lineTo(20.411f, 16.717f)
            curveTo(20.546f, 16.912f, 20.527f, 17.181f, 20.354f, 17.354f)
            curveTo(20.18f, 17.528f, 19.911f, 17.547f, 19.716f, 17.412f)
            lineTo(19.646f, 17.354f)
            lineTo(17.999f, 15.707f)
            lineTo(18f, 21.001f)
            lineTo(17.992f, 21.091f)
            curveTo(17.955f, 21.295f, 17.794f, 21.456f, 17.59f, 21.493f)
            lineTo(17.5f, 21.501f)
            lineTo(17.41f, 21.493f)
            curveTo(17.206f, 21.456f, 17.045f, 21.295f, 17.008f, 21.091f)
            lineTo(17f, 21.001f)
            lineTo(16.999f, 15.709f)
            lineTo(15.354f, 17.354f)
            lineTo(15.284f, 17.412f)
            curveTo(15.114f, 17.531f, 14.886f, 17.531f, 14.716f, 17.412f)
            lineTo(14.646f, 17.354f)
            lineTo(14.589f, 17.285f)
            curveTo(14.47f, 17.115f, 14.47f, 16.887f, 14.589f, 16.717f)
            lineTo(14.646f, 16.647f)
            lineTo(17.159f, 14.135f)
            lineTo(17.215f, 14.09f)
            lineTo(17.289f, 14.048f)
            lineTo(17.372f, 14.018f)
            lineTo(17.432f, 14.006f)
            lineTo(17.488f, 14.001f)
            lineTo(17.542f, 14.003f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BoxArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BoxArrowUp, contentDescription = null)
    }
}
