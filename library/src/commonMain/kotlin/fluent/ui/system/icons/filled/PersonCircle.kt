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

public val FluentIcons.Filled.PersonCircle: ImageVector
    get() {
        if (_PersonCircle != null) {
            return _PersonCircle!!
        }
        _PersonCircle = ImageVector.Builder(
            name = "Filled.PersonCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                close()
                moveTo(17f, 13.5f)
                curveTo(17f, 12.672f, 16.328f, 12f, 15.5f, 12f)
                horizontalLineTo(8.5f)
                curveTo(7.672f, 12f, 7f, 12.672f, 7f, 13.5f)
                verticalLineTo(14f)
                curveTo(7f, 15.971f, 8.86f, 18f, 12f, 18f)
                curveTo(15.141f, 18f, 17f, 15.971f, 17f, 14f)
                verticalLineTo(13.5f)
                close()
                moveTo(14.75f, 8.25f)
                curveTo(14.75f, 6.731f, 13.519f, 5.5f, 12f, 5.5f)
                curveTo(10.481f, 5.5f, 9.25f, 6.731f, 9.25f, 8.25f)
                curveTo(9.25f, 9.769f, 10.481f, 11f, 12f, 11f)
                curveTo(13.519f, 11f, 14.75f, 9.769f, 14.75f, 8.25f)
                close()
            }
        }.build()

        return _PersonCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PersonCircle: ImageVector? = null

@Preview
@Composable
private fun PersonCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonCircle, contentDescription = null)
    }
}
