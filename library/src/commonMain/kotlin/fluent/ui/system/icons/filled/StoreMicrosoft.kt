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

public val FluentIcons.Filled.StoreMicrosoft: ImageVector
    get() {
        if (_StoreMicrosoft != null) {
            return _StoreMicrosoft!!
        }
        _StoreMicrosoft = ImageVector.Builder(
            name = "Filled.StoreMicrosoft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8f, 3.75f)
                verticalLineTo(6f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 6f, 2f, 6.336f, 2f, 6.75f)
                verticalLineTo(18.25f)
                curveTo(2f, 19.769f, 3.231f, 21f, 4.75f, 21f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 21f, 22f, 19.769f, 22f, 18.25f)
                verticalLineTo(6.75f)
                curveTo(22f, 6.336f, 21.664f, 6f, 21.25f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(3.75f)
                curveTo(16f, 2.783f, 15.217f, 2f, 14.25f, 2f)
                horizontalLineTo(9.75f)
                curveTo(8.783f, 2f, 8f, 2.783f, 8f, 3.75f)
                close()
                moveTo(9.75f, 3.5f)
                horizontalLineTo(14.25f)
                curveTo(14.388f, 3.5f, 14.5f, 3.612f, 14.5f, 3.75f)
                verticalLineTo(6f)
                horizontalLineTo(9.5f)
                verticalLineTo(3.75f)
                curveTo(9.5f, 3.612f, 9.612f, 3.5f, 9.75f, 3.5f)
                close()
                moveTo(8f, 13f)
                verticalLineTo(9.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                close()
                moveTo(8f, 17.5f)
                verticalLineTo(14f)
                horizontalLineTo(11.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(8f)
                close()
                moveTo(16f, 13f)
                horizontalLineTo(12.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                close()
                moveTo(12.5f, 17.5f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(17.5f)
                horizontalLineTo(12.5f)
                close()
            }
        }.build()

        return _StoreMicrosoft!!
    }

@Suppress("ObjectPropertyName")
private var _StoreMicrosoft: ImageVector? = null

@Preview
@Composable
private fun StoreMicrosoftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StoreMicrosoft, contentDescription = null)
    }
}
