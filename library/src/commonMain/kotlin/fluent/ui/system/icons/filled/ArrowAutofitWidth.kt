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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.ArrowAutofitWidth: ImageVector
    get() {
        if (_ArrowAutofitWidth != null) {
            return _ArrowAutofitWidth!!
        }
        _ArrowAutofitWidth = ImageVector.Builder(
            name = "Filled.ArrowAutofitWidth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 3.992f)
                curveTo(18.881f, 3.992f, 20f, 5.111f, 20f, 6.492f)
                verticalLineTo(10.492f)
                curveTo(20f, 11.045f, 19.552f, 11.492f, 19f, 11.492f)
                curveTo(18.448f, 11.492f, 18f, 11.045f, 18f, 10.492f)
                verticalLineTo(6.492f)
                curveTo(18f, 6.216f, 17.776f, 5.992f, 17.5f, 5.992f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 5.992f, 6f, 6.216f, 6f, 6.492f)
                verticalLineTo(10.492f)
                curveTo(6f, 11.045f, 5.552f, 11.492f, 5f, 11.492f)
                curveTo(4.448f, 11.492f, 4f, 11.045f, 4f, 10.492f)
                verticalLineTo(6.492f)
                curveTo(4f, 5.111f, 5.119f, 3.992f, 6.5f, 3.992f)
                horizontalLineTo(17.5f)
                close()
                moveTo(18.2f, 13.036f)
                lineTo(18.102f, 12.952f)
                lineTo(18.094f, 12.946f)
                curveTo(17.703f, 12.656f, 17.147f, 12.688f, 16.792f, 13.043f)
                curveTo(16.437f, 13.398f, 16.405f, 13.953f, 16.695f, 14.345f)
                lineTo(16.701f, 14.353f)
                lineTo(16.786f, 14.451f)
                lineTo(17.586f, 15.25f)
                horizontalLineTo(14.397f)
                lineTo(14.288f, 15.258f)
                lineTo(14.279f, 15.26f)
                curveTo(13.815f, 15.332f, 13.5f, 15.771f, 13.5f, 16.25f)
                curveTo(13.5f, 16.729f, 13.815f, 17.168f, 14.279f, 17.24f)
                lineTo(14.288f, 17.242f)
                lineTo(14.397f, 17.25f)
                horizontalLineTo(17.587f)
                lineTo(16.785f, 18.052f)
                lineTo(16.692f, 18.161f)
                lineTo(16.686f, 18.17f)
                curveTo(16.434f, 18.521f, 16.437f, 18.998f, 16.695f, 19.347f)
                lineTo(16.701f, 19.354f)
                lineTo(16.792f, 19.46f)
                lineTo(16.909f, 19.559f)
                lineTo(16.917f, 19.565f)
                curveTo(17.269f, 19.817f, 17.746f, 19.814f, 18.094f, 19.555f)
                lineTo(18.102f, 19.55f)
                lineTo(18.2f, 19.465f)
                lineTo(20.561f, 17.107f)
                lineTo(20.625f, 17.061f)
                lineTo(20.632f, 17.056f)
                curveTo(20.861f, 16.87f, 21f, 16.574f, 21f, 16.251f)
                curveTo(21f, 15.895f, 20.83f, 15.57f, 20.557f, 15.391f)
                lineTo(18.2f, 13.036f)
                close()
                moveTo(7.274f, 14.356f)
                lineTo(7.189f, 14.454f)
                lineTo(6.389f, 15.253f)
                horizontalLineTo(9.568f)
                curveTo(10.099f, 15.253f, 10.475f, 15.733f, 10.475f, 16.253f)
                curveTo(10.475f, 16.732f, 10.16f, 17.171f, 9.696f, 17.243f)
                lineTo(9.686f, 17.244f)
                lineTo(9.578f, 17.253f)
                horizontalLineTo(6.388f)
                lineTo(7.183f, 18.047f)
                curveTo(7.538f, 18.403f, 7.57f, 18.958f, 7.279f, 19.35f)
                lineTo(7.274f, 19.357f)
                lineTo(7.189f, 19.455f)
                lineTo(7.183f, 19.462f)
                curveTo(6.827f, 19.817f, 6.272f, 19.849f, 5.88f, 19.558f)
                lineTo(5.873f, 19.553f)
                lineTo(5.775f, 19.468f)
                lineTo(3.418f, 17.114f)
                curveTo(3.145f, 16.935f, 2.975f, 16.61f, 2.975f, 16.254f)
                curveTo(2.975f, 15.898f, 3.145f, 15.573f, 3.418f, 15.393f)
                lineTo(5.768f, 13.046f)
                curveTo(6.159f, 12.655f, 6.792f, 12.655f, 7.183f, 13.046f)
                curveTo(7.538f, 13.401f, 7.57f, 13.956f, 7.279f, 14.348f)
                lineTo(7.274f, 14.356f)
                close()
            }
        }.build()

        return _ArrowAutofitWidth!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowAutofitWidth: ImageVector? = null

@Preview
@Composable
private fun ArrowAutofitWidthPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowAutofitWidth, contentDescription = null)
    }
}
