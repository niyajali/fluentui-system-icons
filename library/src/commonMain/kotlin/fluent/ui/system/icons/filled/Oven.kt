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

public val FluentIcons.Filled.Oven: ImageVector
    get() {
        if (_Oven != null) {
            return _Oven!!
        }
        _Oven = ImageVector.Builder(
            name = "Filled.Oven",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(3f)
                verticalLineTo(6.25f)
                close()
                moveTo(8f, 7f)
                curveTo(8.552f, 7f, 9f, 6.552f, 9f, 6f)
                curveTo(9f, 5.448f, 8.552f, 5f, 8f, 5f)
                curveTo(7.448f, 5f, 7f, 5.448f, 7f, 6f)
                curveTo(7f, 6.552f, 7.448f, 7f, 8f, 7f)
                close()
                moveTo(13f, 6f)
                curveTo(13f, 5.448f, 12.552f, 5f, 12f, 5f)
                curveTo(11.448f, 5f, 11f, 5.448f, 11f, 6f)
                curveTo(11f, 6.552f, 11.448f, 7f, 12f, 7f)
                curveTo(12.552f, 7f, 13f, 6.552f, 13f, 6f)
                close()
                moveTo(17f, 6f)
                curveTo(17f, 5.448f, 16.552f, 5f, 16f, 5f)
                curveTo(15.448f, 5f, 15f, 5.448f, 15f, 6f)
                curveTo(15f, 6.552f, 15.448f, 7f, 16f, 7f)
                curveTo(16.552f, 7f, 17f, 6.552f, 17f, 6f)
                close()
                moveTo(3f, 17.75f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                close()
                moveTo(7.25f, 12f)
                curveTo(6.56f, 12f, 6f, 12.56f, 6f, 13.25f)
                verticalLineTo(16.75f)
                curveTo(6f, 17.44f, 6.56f, 18f, 7.25f, 18f)
                horizontalLineTo(16.75f)
                curveTo(17.44f, 18f, 18f, 17.44f, 18f, 16.75f)
                verticalLineTo(13.25f)
                curveTo(18f, 12.56f, 17.44f, 12f, 16.75f, 12f)
                horizontalLineTo(7.25f)
                close()
            }
        }.build()

        return _Oven!!
    }

@Suppress("ObjectPropertyName")
private var _Oven: ImageVector? = null

@Preview
@Composable
private fun OvenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Oven, contentDescription = null)
    }
}
