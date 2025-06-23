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
package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.DualScreenHeader: ImageVector
    get() {
        if (_DualScreenHeader != null) {
            return _DualScreenHeader!!
        }
        _DualScreenHeader = ImageVector.Builder(
            name = "Regular.DualScreenHeader",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.748f, 4.002f)
                lineTo(12.747f, 4.004f)
                lineTo(20.245f, 4.004f)
                curveTo(21.212f, 4.004f, 21.995f, 4.788f, 21.995f, 5.754f)
                verticalLineTo(18.25f)
                curveTo(21.995f, 19.216f, 21.212f, 20f, 20.245f, 20f)
                horizontalLineTo(11.248f)
                lineTo(11.247f, 19.997f)
                lineTo(3.75f, 19.997f)
                curveTo(2.783f, 19.997f, 2f, 19.214f, 2f, 18.247f)
                verticalLineTo(5.752f)
                curveTo(2f, 4.785f, 2.783f, 4.002f, 3.75f, 4.002f)
                horizontalLineTo(12.748f)
                close()
                moveTo(20.495f, 7f)
                horizontalLineTo(12.747f)
                lineTo(12.748f, 18.5f)
                horizontalLineTo(20.245f)
                curveTo(20.383f, 18.5f, 20.495f, 18.388f, 20.495f, 18.25f)
                lineTo(20.495f, 7f)
                close()
                moveTo(11.247f, 7f)
                horizontalLineTo(3.5f)
                verticalLineTo(18.247f)
                curveTo(3.5f, 18.385f, 3.612f, 18.497f, 3.75f, 18.497f)
                horizontalLineTo(11.248f)
                lineTo(11.247f, 7f)
                close()
            }
        }.build()

        return _DualScreenHeader!!
    }

@Suppress("ObjectPropertyName")
private var _DualScreenHeader: ImageVector? = null

@Preview
@Composable
private fun DualScreenHeaderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DualScreenHeader, contentDescription = null)
    }
}
