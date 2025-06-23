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

public val FluentIcons.Filled.ThumbLike: ImageVector
    get() {
        if (_ThumbLike != null) {
            return _ThumbLike!!
        }
        _ThumbLike = ImageVector.Builder(
            name = "Filled.ThumbLike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.056f, 9.004f)
                curveTo(15.516f, 7.577f, 15.749f, 6.327f, 15.749f, 5.25f)
                curveTo(15.749f, 2.852f, 14.81f, 1.003f, 13.249f, 1.003f)
                curveTo(12.402f, 1.003f, 12.14f, 1.507f, 11.812f, 2.75f)
                curveTo(11.83f, 2.685f, 11.649f, 3.384f, 11.597f, 3.571f)
                curveTo(11.496f, 3.93f, 11.32f, 4.54f, 11.07f, 5.402f)
                curveTo(11.063f, 5.425f, 11.053f, 5.447f, 11.04f, 5.467f)
                lineTo(8.174f, 9.953f)
                curveTo(7.496f, 11.014f, 6.495f, 11.829f, 5.319f, 12.279f)
                lineTo(4.062f, 12.761f)
                curveTo(3.269f, 13.064f, 2.808f, 13.894f, 2.97f, 14.728f)
                lineTo(3.656f, 18.267f)
                curveTo(3.823f, 19.129f, 4.476f, 19.815f, 5.329f, 20.024f)
                lineTo(13.579f, 22.046f)
                curveTo(16.11f, 22.666f, 18.668f, 21.131f, 19.312f, 18.606f)
                lineTo(20.886f, 12.433f)
                curveTo(21.261f, 10.961f, 20.372f, 9.464f, 18.901f, 9.089f)
                curveTo(18.679f, 9.032f, 18.45f, 9.004f, 18.221f, 9.004f)
                horizontalLineTo(15.056f)
                close()
            }
        }.build()

        return _ThumbLike!!
    }

@Suppress("ObjectPropertyName")
private var _ThumbLike: ImageVector? = null

@Preview
@Composable
private fun ThumbLikePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ThumbLike, contentDescription = null)
    }
}
