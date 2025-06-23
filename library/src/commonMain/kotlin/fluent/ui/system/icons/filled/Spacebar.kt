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

public val FluentIcons.Filled.Spacebar: ImageVector
    get() {
        if (_Spacebar != null) {
            return _Spacebar!!
        }
        _Spacebar = ImageVector.Builder(
            name = "Filled.Spacebar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                curveTo(4f, 10.448f, 3.552f, 10f, 3f, 10f)
                curveTo(2.448f, 10f, 2f, 10.448f, 2f, 11f)
                verticalLineTo(13f)
                curveTo(2f, 14.105f, 2.895f, 15f, 4f, 15f)
                horizontalLineTo(20f)
                curveTo(21.105f, 15f, 22f, 14.105f, 22f, 13f)
                verticalLineTo(11f)
                curveTo(22f, 10.448f, 21.552f, 10f, 21f, 10f)
                curveTo(20.448f, 10f, 20f, 10.448f, 20f, 11f)
                close()
            }
        }.build()

        return _Spacebar!!
    }

@Suppress("ObjectPropertyName")
private var _Spacebar: ImageVector? = null

@Preview
@Composable
private fun SpacebarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Spacebar, contentDescription = null)
    }
}
