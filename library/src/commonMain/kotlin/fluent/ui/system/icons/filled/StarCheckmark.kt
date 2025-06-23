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

public val FluentIcons.Filled.StarCheckmark: ImageVector
    get() {
        if (_StarCheckmark != null) {
            return _StarCheckmark!!
        }
        _StarCheckmark = ImageVector.Builder(
            name = "Filled.StarCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.209f, 3.103f)
                curveTo(12.714f, 2.1f, 11.283f, 2.1f, 10.788f, 3.103f)
                lineTo(8.43f, 7.881f)
                lineTo(3.157f, 8.647f)
                curveTo(2.05f, 8.808f, 1.608f, 10.169f, 2.409f, 10.95f)
                lineTo(6.224f, 14.669f)
                lineTo(5.324f, 19.92f)
                curveTo(5.135f, 21.023f, 6.292f, 21.864f, 7.283f, 21.343f)
                lineTo(11.241f, 19.262f)
                curveTo(11.084f, 18.702f, 11f, 18.111f, 11f, 17.5f)
                curveTo(11f, 13.911f, 13.91f, 11f, 17.5f, 11f)
                curveTo(18.656f, 11f, 19.742f, 11.302f, 20.683f, 11.832f)
                lineTo(21.588f, 10.95f)
                curveTo(22.389f, 10.169f, 21.947f, 8.808f, 20.84f, 8.647f)
                lineTo(15.567f, 7.881f)
                lineTo(13.209f, 3.103f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(20.854f, 15.146f)
                curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
                lineTo(16.5f, 18.793f)
                lineTo(14.854f, 17.146f)
                curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
                curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
                lineTo(16.146f, 19.854f)
                curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
                lineTo(20.854f, 15.854f)
                curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
                close()
            }
        }.build()

        return _StarCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _StarCheckmark: ImageVector? = null

@Preview
@Composable
private fun StarCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StarCheckmark, contentDescription = null)
    }
}
