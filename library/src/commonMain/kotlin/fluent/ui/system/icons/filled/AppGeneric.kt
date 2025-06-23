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

public val FluentIcons.Filled.AppGeneric: ImageVector
    get() {
        if (_AppGeneric != null) {
            return _AppGeneric!!
        }
        _AppGeneric = ImageVector.Builder(
            name = "Filled.AppGeneric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 8f)
                horizontalLineTo(19.5f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(8f)
                close()
                moveTo(6f, 10.35f)
                curveTo(6f, 9.881f, 6.381f, 9.5f, 6.85f, 9.5f)
                horizontalLineTo(10.15f)
                curveTo(10.619f, 9.5f, 11f, 9.881f, 11f, 10.35f)
                verticalLineTo(17.15f)
                curveTo(11f, 17.619f, 10.619f, 18f, 10.15f, 18f)
                horizontalLineTo(6.85f)
                curveTo(6.381f, 18f, 6f, 17.619f, 6f, 17.15f)
                verticalLineTo(10.35f)
                close()
                moveTo(7.5f, 11f)
                verticalLineTo(16.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(11f)
                horizontalLineTo(7.5f)
                close()
                moveTo(12.75f, 9.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 9.5f, 18f, 9.836f, 18f, 10.25f)
                curveTo(18f, 10.664f, 17.664f, 11f, 17.25f, 11f)
                horizontalLineTo(12.75f)
                curveTo(12.336f, 11f, 12f, 10.664f, 12f, 10.25f)
                curveTo(12f, 9.836f, 12.336f, 9.5f, 12.75f, 9.5f)
                close()
                moveTo(12f, 13.25f)
                curveTo(12f, 12.836f, 12.336f, 12.5f, 12.75f, 12.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 12.5f, 17f, 12.836f, 17f, 13.25f)
                curveTo(17f, 13.664f, 16.664f, 14f, 16.25f, 14f)
                horizontalLineTo(12.75f)
                curveTo(12.336f, 14f, 12f, 13.664f, 12f, 13.25f)
                close()
            }
        }.build()

        return _AppGeneric!!
    }

@Suppress("ObjectPropertyName")
private var _AppGeneric: ImageVector? = null

@Preview
@Composable
private fun AppGenericPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AppGeneric, contentDescription = null)
    }
}
