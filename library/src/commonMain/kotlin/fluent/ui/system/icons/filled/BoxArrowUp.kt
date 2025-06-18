/*
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
package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.BoxArrowUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BoxArrowUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.409f, 2.513f)
            curveTo(12.505f, 2.147f, 11.495f, 2.147f, 10.591f, 2.513f)
            lineTo(8.401f, 3.401f)
            lineTo(17.993f, 7.131f)
            lineTo(21.367f, 5.828f)
            curveTo(21.231f, 5.715f, 21.077f, 5.622f, 20.907f, 5.553f)
            lineTo(13.409f, 2.513f)
            close()
            moveTo(22f, 7.191f)
            lineTo(12.75f, 10.765f)
            verticalLineTo(13.064f)
            curveTo(13.936f, 11.795f, 15.625f, 11.001f, 17.5f, 11.001f)
            curveTo(19.247f, 11.001f, 20.832f, 11.69f, 22f, 12.811f)
            verticalLineTo(7.191f)
            close()
            moveTo(11.25f, 10.765f)
            verticalLineTo(15.71f)
            curveTo(11.087f, 16.279f, 11f, 16.88f, 11f, 17.501f)
            curveTo(11f, 18.122f, 11.087f, 18.723f, 11.25f, 19.292f)
            verticalLineTo(21.688f)
            curveTo(11.026f, 21.642f, 10.806f, 21.576f, 10.591f, 21.489f)
            lineTo(3.093f, 18.449f)
            curveTo(2.432f, 18.181f, 2f, 17.54f, 2f, 16.827f)
            verticalLineTo(7.191f)
            lineTo(11.25f, 10.765f)
            close()
            moveTo(2.633f, 5.828f)
            lineTo(12f, 9.447f)
            lineTo(15.917f, 7.933f)
            lineTo(6.374f, 4.223f)
            lineTo(3.093f, 5.553f)
            curveTo(2.923f, 5.622f, 2.769f, 5.715f, 2.633f, 5.828f)
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
        Image(imageVector = FluentUi.Filled.BoxArrowUp, contentDescription = null)
    }
}
