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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.DualScreenVerticalScroll: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.DualScreenVerticalScroll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.245f, 4.004f)
                curveTo(21.212f, 4.004f, 21.995f, 4.788f, 21.995f, 5.754f)
                verticalLineTo(18.25f)
                curveTo(21.995f, 19.216f, 21.212f, 20f, 20.245f, 20f)
                horizontalLineTo(12.998f)
                curveTo(12.911f, 20f, 12.825f, 19.993f, 12.742f, 19.981f)
                lineTo(12.742f, 4.023f)
                curveTo(12.825f, 4.011f, 12.911f, 4.004f, 12.998f, 4.004f)
                horizontalLineTo(20.245f)
                close()
                moveTo(10.998f, 4.002f)
                curveTo(11.081f, 4.002f, 11.163f, 4.008f, 11.243f, 4.019f)
                lineTo(11.243f, 19.98f)
                curveTo(11.163f, 19.991f, 11.081f, 19.997f, 10.998f, 19.997f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 19.997f, 2f, 19.214f, 2f, 18.247f)
                verticalLineTo(5.752f)
                curveTo(2f, 4.785f, 2.783f, 4.002f, 3.75f, 4.002f)
                horizontalLineTo(10.998f)
                close()
                moveTo(15.702f, 13.402f)
                curveTo(15.41f, 13.181f, 14.993f, 13.202f, 14.725f, 13.465f)
                curveTo(14.456f, 13.729f, 14.428f, 14.146f, 14.643f, 14.441f)
                lineTo(14.715f, 14.526f)
                lineTo(16.968f, 16.822f)
                lineTo(17.052f, 16.896f)
                curveTo(17.318f, 17.097f, 17.688f, 17.097f, 17.954f, 16.896f)
                lineTo(18.039f, 16.822f)
                lineTo(20.289f, 14.526f)
                lineTo(20.36f, 14.441f)
                curveTo(20.575f, 14.145f, 20.547f, 13.729f, 20.278f, 13.465f)
                curveTo(20.009f, 13.201f, 19.592f, 13.182f, 19.301f, 13.402f)
                lineTo(19.217f, 13.476f)
                lineTo(17.503f, 15.225f)
                lineTo(15.785f, 13.475f)
                lineTo(15.702f, 13.402f)
                close()
                moveTo(18.039f, 7.226f)
                curveTo(17.771f, 6.953f, 17.348f, 6.928f, 17.052f, 7.151f)
                lineTo(16.968f, 7.225f)
                lineTo(14.715f, 9.521f)
                curveTo(14.425f, 9.817f, 14.429f, 10.292f, 14.725f, 10.582f)
                curveTo(14.993f, 10.846f, 15.41f, 10.866f, 15.702f, 10.645f)
                lineTo(15.785f, 10.572f)
                lineTo(17.503f, 8.822f)
                lineTo(19.217f, 10.571f)
                curveTo(19.507f, 10.867f, 19.982f, 10.872f, 20.278f, 10.582f)
                curveTo(20.547f, 10.319f, 20.575f, 9.902f, 20.36f, 9.606f)
                lineTo(20.289f, 9.522f)
                lineTo(18.039f, 7.226f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun DualScreenVerticalScrollPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DualScreenVerticalScroll, contentDescription = null)
    }
}
