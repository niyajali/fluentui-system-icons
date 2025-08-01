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

public val FluentIcons.Filled.TagError: ImageVector
    get() {
        if (_TagError != null) {
            return _TagError!!
        }
        _TagError = ImageVector.Builder(
            name = "Filled.TagError",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.75f, 2f)
                curveTo(20.993f, 2f, 22f, 3.007f, 22f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(22f, 10.574f, 21.657f, 11.4f, 21.048f, 12.01f)
                lineTo(21.022f, 12.036f)
                curveTo(20.007f, 11.38f, 18.798f, 11f, 17.5f, 11f)
                curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
                curveTo(11f, 18.77f, 11.364f, 19.955f, 11.994f, 20.957f)
                curveTo(10.737f, 21.757f, 9.05f, 21.61f, 7.951f, 20.514f)
                lineTo(3.489f, 16.059f)
                curveTo(2.219f, 14.791f, 2.217f, 12.733f, 3.485f, 11.463f)
                lineTo(11.985f, 2.953f)
                curveTo(12.595f, 2.343f, 13.422f, 2f, 14.285f, 2f)
                horizontalLineTo(19.75f)
                close()
                moveTo(17f, 5.502f)
                curveTo(16.171f, 5.502f, 15.5f, 6.174f, 15.5f, 7.002f)
                curveTo(15.5f, 7.831f, 16.171f, 8.502f, 17f, 8.502f)
                curveTo(17.828f, 8.502f, 18.5f, 7.831f, 18.5f, 7.002f)
                curveTo(18.5f, 6.174f, 17.828f, 5.502f, 17f, 5.502f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.537f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.537f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(17.5f, 14f)
                curveTo(17.224f, 14f, 17f, 14.224f, 17f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(17f, 18.776f, 17.224f, 19f, 17.5f, 19f)
                curveTo(17.776f, 19f, 18f, 18.776f, 18f, 18.5f)
                verticalLineTo(14.5f)
                curveTo(18f, 14.224f, 17.776f, 14f, 17.5f, 14f)
                close()
                moveTo(17.5f, 21.125f)
                curveTo(17.845f, 21.125f, 18.125f, 20.845f, 18.125f, 20.5f)
                curveTo(18.125f, 20.155f, 17.845f, 19.875f, 17.5f, 19.875f)
                curveTo(17.155f, 19.875f, 16.875f, 20.155f, 16.875f, 20.5f)
                curveTo(16.875f, 20.845f, 17.155f, 21.125f, 17.5f, 21.125f)
                close()
            }
        }.build()

        return _TagError!!
    }

@Suppress("ObjectPropertyName")
private var _TagError: ImageVector? = null

@Preview
@Composable
private fun TagErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TagError, contentDescription = null)
    }
}
