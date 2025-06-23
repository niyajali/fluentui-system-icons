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

public val FluentIcons.Filled.ArrowAutofitHeight: ImageVector
    get() {
        if (_ArrowAutofitHeight != null) {
            return _ArrowAutofitHeight!!
        }
        _ArrowAutofitHeight = ImageVector.Builder(
            name = "Filled.ArrowAutofitHeight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.952f, 5.898f)
                lineTo(13.036f, 5.8f)
                lineTo(15.391f, 3.443f)
                curveTo(15.57f, 3.17f, 15.895f, 3f, 16.251f, 3f)
                curveTo(16.574f, 3f, 16.87f, 3.139f, 17.056f, 3.368f)
                lineTo(17.061f, 3.375f)
                lineTo(17.107f, 3.439f)
                lineTo(19.465f, 5.8f)
                lineTo(19.55f, 5.898f)
                lineTo(19.555f, 5.906f)
                curveTo(19.814f, 6.254f, 19.817f, 6.731f, 19.565f, 7.083f)
                lineTo(19.559f, 7.091f)
                lineTo(19.46f, 7.208f)
                lineTo(19.354f, 7.299f)
                lineTo(19.347f, 7.305f)
                curveTo(18.998f, 7.563f, 18.521f, 7.566f, 18.17f, 7.314f)
                lineTo(18.161f, 7.308f)
                lineTo(18.052f, 7.215f)
                lineTo(17.25f, 6.413f)
                verticalLineTo(9.603f)
                lineTo(17.242f, 9.712f)
                lineTo(17.24f, 9.721f)
                curveTo(17.168f, 10.185f, 16.729f, 10.5f, 16.25f, 10.5f)
                curveTo(15.771f, 10.5f, 15.332f, 10.185f, 15.26f, 9.721f)
                lineTo(15.258f, 9.711f)
                lineTo(15.25f, 9.603f)
                verticalLineTo(6.414f)
                lineTo(14.451f, 7.214f)
                lineTo(14.353f, 7.299f)
                lineTo(14.345f, 7.305f)
                curveTo(13.953f, 7.595f, 13.398f, 7.563f, 13.043f, 7.208f)
                curveTo(12.688f, 6.853f, 12.656f, 6.297f, 12.946f, 5.906f)
                lineTo(12.952f, 5.898f)
                close()
                moveTo(4f, 6.492f)
                curveTo(4f, 5.111f, 5.119f, 3.992f, 6.5f, 3.992f)
                horizontalLineTo(10.5f)
                curveTo(11.052f, 3.992f, 11.5f, 4.44f, 11.5f, 4.992f)
                curveTo(11.5f, 5.544f, 11.052f, 5.992f, 10.5f, 5.992f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 5.992f, 6f, 6.216f, 6f, 6.492f)
                verticalLineTo(17.492f)
                curveTo(6f, 17.768f, 6.224f, 17.992f, 6.5f, 17.992f)
                horizontalLineTo(10.5f)
                curveTo(11.052f, 17.992f, 11.5f, 18.44f, 11.5f, 18.992f)
                curveTo(11.5f, 19.545f, 11.052f, 19.992f, 10.5f, 19.992f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 19.992f, 4f, 18.873f, 4f, 17.492f)
                verticalLineTo(6.492f)
                close()
                moveTo(14.453f, 16.786f)
                lineTo(14.354f, 16.701f)
                lineTo(14.347f, 16.695f)
                curveTo(13.955f, 16.405f, 13.4f, 16.437f, 13.045f, 16.792f)
                curveTo(12.654f, 17.183f, 12.654f, 17.816f, 13.045f, 18.206f)
                lineTo(15.392f, 20.557f)
                curveTo(15.571f, 20.83f, 15.897f, 21f, 16.253f, 21f)
                curveTo(16.609f, 21f, 16.934f, 20.83f, 17.113f, 20.556f)
                lineTo(19.467f, 18.2f)
                lineTo(19.552f, 18.102f)
                lineTo(19.557f, 18.094f)
                curveTo(19.848f, 17.703f, 19.816f, 17.147f, 19.461f, 16.792f)
                lineTo(19.454f, 16.786f)
                lineTo(19.356f, 16.701f)
                lineTo(19.349f, 16.695f)
                curveTo(18.957f, 16.405f, 18.402f, 16.437f, 18.046f, 16.792f)
                lineTo(17.252f, 17.587f)
                verticalLineTo(14.397f)
                lineTo(17.244f, 14.288f)
                lineTo(17.242f, 14.279f)
                curveTo(17.17f, 13.815f, 16.731f, 13.5f, 16.252f, 13.5f)
                curveTo(15.732f, 13.5f, 15.252f, 13.876f, 15.252f, 14.406f)
                verticalLineTo(17.586f)
                lineTo(14.453f, 16.786f)
                close()
            }
        }.build()

        return _ArrowAutofitHeight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowAutofitHeight: ImageVector? = null

@Preview
@Composable
private fun ArrowAutofitHeightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowAutofitHeight, contentDescription = null)
    }
}
