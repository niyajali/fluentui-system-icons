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

public val FluentIcons.Filled.DocumentLandscape: ImageVector
    get() {
        if (_DocumentLandscape != null) {
            return _DocumentLandscape!!
        }
        _DocumentLandscape = ImageVector.Builder(
            name = "Filled.DocumentLandscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22f, 12f)
                lineTo(16f, 12f)
                curveTo(14.895f, 12f, 14f, 11.105f, 14f, 10f)
                verticalLineTo(4f)
                lineTo(4f, 4f)
                curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
                lineTo(2f, 18f)
                curveTo(2f, 19.105f, 2.895f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.105f, 20f, 22f, 19.105f, 22f, 18f)
                verticalLineTo(12f)
                close()
                moveTo(21.5f, 10.5f)
                lineTo(16f, 10.5f)
                curveTo(15.724f, 10.5f, 15.5f, 10.276f, 15.5f, 10f)
                verticalLineTo(4.5f)
                lineTo(21.5f, 10.5f)
                close()
            }
        }.build()

        return _DocumentLandscape!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentLandscape: ImageVector? = null

@Preview
@Composable
private fun DocumentLandscapePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentLandscape, contentDescription = null)
    }
}
