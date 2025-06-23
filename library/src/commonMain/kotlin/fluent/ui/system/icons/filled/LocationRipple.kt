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

public val FluentIcons.Filled.LocationRipple: ImageVector
    get() {
        if (_LocationRipple != null) {
            return _LocationRipple!!
        }
        _LocationRipple = ImageVector.Builder(
            name = "Filled.LocationRipple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(7.858f, 2f, 4.5f, 5.358f, 4.5f, 9.5f)
                curveTo(4.5f, 11.432f, 5.564f, 13.301f, 6.768f, 14.816f)
                curveTo(7.988f, 16.353f, 9.446f, 17.645f, 10.423f, 18.438f)
                curveTo(11.349f, 19.188f, 12.651f, 19.188f, 13.577f, 18.438f)
                curveTo(14.554f, 17.645f, 16.012f, 16.353f, 17.232f, 14.816f)
                curveTo(18.436f, 13.301f, 19.5f, 11.432f, 19.5f, 9.5f)
                curveTo(19.5f, 5.358f, 16.142f, 2f, 12f, 2f)
                close()
                moveTo(14.5f, 9.5f)
                curveTo(14.5f, 10.881f, 13.381f, 12f, 12f, 12f)
                curveTo(10.619f, 12f, 9.5f, 10.881f, 9.5f, 9.5f)
                curveTo(9.5f, 8.119f, 10.619f, 7f, 12f, 7f)
                curveTo(13.381f, 7f, 14.5f, 8.119f, 14.5f, 9.5f)
                close()
                moveTo(17.682f, 15.847f)
                curveTo(17.318f, 16.279f, 16.942f, 16.688f, 16.568f, 17.07f)
                curveTo(16.924f, 17.17f, 17.255f, 17.28f, 17.559f, 17.4f)
                curveTo(18.254f, 17.674f, 18.765f, 17.981f, 19.09f, 18.284f)
                curveTo(19.415f, 18.586f, 19.5f, 18.828f, 19.5f, 19f)
                curveTo(19.5f, 19.172f, 19.415f, 19.414f, 19.09f, 19.716f)
                curveTo(18.765f, 20.019f, 18.254f, 20.327f, 17.559f, 20.6f)
                curveTo(16.173f, 21.146f, 14.208f, 21.5f, 12f, 21.5f)
                curveTo(9.792f, 21.5f, 7.827f, 21.146f, 6.441f, 20.6f)
                curveTo(5.746f, 20.327f, 5.235f, 20.019f, 4.909f, 19.716f)
                curveTo(4.585f, 19.414f, 4.5f, 19.172f, 4.5f, 19f)
                curveTo(4.5f, 18.828f, 4.585f, 18.586f, 4.909f, 18.284f)
                curveTo(5.235f, 17.981f, 5.746f, 17.674f, 6.441f, 17.4f)
                curveTo(6.745f, 17.28f, 7.076f, 17.17f, 7.432f, 17.07f)
                curveTo(7.058f, 16.688f, 6.682f, 16.279f, 6.318f, 15.847f)
                curveTo(6.172f, 15.897f, 6.03f, 15.95f, 5.891f, 16.004f)
                curveTo(5.093f, 16.319f, 4.397f, 16.712f, 3.887f, 17.186f)
                curveTo(3.376f, 17.662f, 3f, 18.274f, 3f, 19f)
                curveTo(3f, 19.726f, 3.376f, 20.338f, 3.887f, 20.814f)
                curveTo(4.397f, 21.289f, 5.093f, 21.682f, 5.891f, 21.996f)
                curveTo(7.492f, 22.626f, 9.652f, 23f, 12f, 23f)
                curveTo(14.348f, 23f, 16.508f, 22.626f, 18.108f, 21.996f)
                curveTo(18.907f, 21.682f, 19.603f, 21.289f, 20.113f, 20.814f)
                curveTo(20.624f, 20.338f, 21f, 19.726f, 21f, 19f)
                curveTo(21f, 18.274f, 20.624f, 17.662f, 20.113f, 17.186f)
                curveTo(19.603f, 16.712f, 18.907f, 16.319f, 18.108f, 16.004f)
                curveTo(17.97f, 15.95f, 17.828f, 15.897f, 17.682f, 15.847f)
                close()
            }
        }.build()

        return _LocationRipple!!
    }

@Suppress("ObjectPropertyName")
private var _LocationRipple: ImageVector? = null

@Preview
@Composable
private fun LocationRipplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LocationRipple, contentDescription = null)
    }
}
