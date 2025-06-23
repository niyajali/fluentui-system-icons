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

public val FluentIcons.Filled.PersonAvailable: ImageVector
    get() {
        if (_PersonAvailable != null) {
            return _PersonAvailable!!
        }
        _PersonAvailable = ImageVector.Builder(
            name = "Filled.PersonAvailable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.463f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.463f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.463f, 14.463f, 12f, 17.5f, 12f)
                close()
                moveTo(12.023f, 14f)
                curveTo(11.375f, 15.01f, 11f, 16.211f, 11f, 17.5f)
                curveTo(11f, 19.131f, 11.601f, 20.621f, 12.592f, 21.762f)
                curveTo(11.797f, 21.922f, 10.932f, 22.001f, 10f, 22.001f)
                curveTo(6.579f, 22.001f, 4.056f, 20.929f, 2.514f, 18.765f)
                curveTo(2.182f, 18.299f, 2.004f, 17.741f, 2.004f, 17.169f)
                verticalLineTo(16.249f)
                curveTo(2.004f, 15.007f, 3.011f, 14f, 4.253f, 14f)
                lineTo(12.023f, 14f)
                close()
                moveTo(14.854f, 17.147f)
                curveTo(14.659f, 16.951f, 14.342f, 16.951f, 14.147f, 17.147f)
                curveTo(13.951f, 17.342f, 13.951f, 17.659f, 14.147f, 17.854f)
                lineTo(16.147f, 19.854f)
                curveTo(16.342f, 20.049f, 16.659f, 20.049f, 16.854f, 19.854f)
                lineTo(20.854f, 15.854f)
                curveTo(21.049f, 15.659f, 21.049f, 15.342f, 20.854f, 15.147f)
                curveTo(20.659f, 14.951f, 20.342f, 14.951f, 20.147f, 15.147f)
                lineTo(16.5f, 18.793f)
                lineTo(14.854f, 17.147f)
                close()
                moveTo(10f, 2.005f)
                curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
                curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
                curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
                curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
                close()
            }
        }.build()

        return _PersonAvailable!!
    }

@Suppress("ObjectPropertyName")
private var _PersonAvailable: ImageVector? = null

@Preview
@Composable
private fun PersonAvailablePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonAvailable, contentDescription = null)
    }
}
