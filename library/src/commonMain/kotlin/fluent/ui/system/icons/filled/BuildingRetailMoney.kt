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

public val FluentIcons.Filled.BuildingRetailMoney: ImageVector
    get() {
        if (_BuildingRetailMoney != null) {
            return _BuildingRetailMoney!!
        }
        _BuildingRetailMoney = ImageVector.Builder(
            name = "Filled.BuildingRetailMoney",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.5f, 11.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(7.5f)
                close()
                moveTo(4f, 3f)
                curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
                curveTo(2f, 5.74f, 2.402f, 6.387f, 3f, 6.732f)
                verticalLineTo(20.25f)
                curveTo(3f, 20.664f, 3.336f, 21f, 3.75f, 21f)
                horizontalLineTo(6f)
                verticalLineTo(15.75f)
                curveTo(6f, 15.336f, 6.336f, 15f, 6.75f, 15f)
                horizontalLineTo(10.75f)
                curveTo(11.164f, 15f, 11.5f, 15.336f, 11.5f, 15.75f)
                verticalLineTo(16f)
                curveTo(11.956f, 15.393f, 12.682f, 15f, 13.5f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(6.732f)
                curveTo(21.598f, 6.387f, 22f, 5.74f, 22f, 5f)
                curveTo(22f, 3.895f, 21.105f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                close()
                moveTo(3.5f, 5f)
                curveTo(3.5f, 4.724f, 3.724f, 4.5f, 4f, 4.5f)
                horizontalLineTo(20f)
                curveTo(20.276f, 4.5f, 20.5f, 4.724f, 20.5f, 5f)
                curveTo(20.5f, 5.276f, 20.276f, 5.5f, 20f, 5.5f)
                horizontalLineTo(4f)
                curveTo(3.724f, 5.5f, 3.5f, 5.276f, 3.5f, 5f)
                close()
                moveTo(6.75f, 8f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 8f, 18f, 8.336f, 18f, 8.75f)
                verticalLineTo(12.25f)
                curveTo(18f, 12.664f, 17.664f, 13f, 17.25f, 13f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 13f, 6f, 12.664f, 6f, 12.25f)
                verticalLineTo(8.75f)
                curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
                close()
                moveTo(10f, 16.5f)
                verticalLineTo(21f)
                horizontalLineTo(7.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(10f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 16.672f, 12.672f, 16f, 13.5f, 16f)
                horizontalLineTo(21.5f)
                curveTo(22.328f, 16f, 23f, 16.672f, 23f, 17.5f)
                verticalLineTo(21.5f)
                curveTo(23f, 22.328f, 22.328f, 23f, 21.5f, 23f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 23f, 12f, 22.328f, 12f, 21.5f)
                verticalLineTo(17.5f)
                close()
                moveTo(22f, 18f)
                curveTo(21.448f, 18f, 21f, 17.552f, 21f, 17f)
                horizontalLineTo(20f)
                curveTo(20f, 18.105f, 20.895f, 19f, 22f, 19f)
                verticalLineTo(18f)
                close()
                moveTo(22f, 20f)
                curveTo(20.895f, 20f, 20f, 20.895f, 20f, 22f)
                horizontalLineTo(21f)
                curveTo(21f, 21.448f, 21.448f, 21f, 22f, 21f)
                verticalLineTo(20f)
                close()
                moveTo(14f, 17f)
                curveTo(14f, 17.552f, 13.552f, 18f, 13f, 18f)
                verticalLineTo(19f)
                curveTo(14.105f, 19f, 15f, 18.105f, 15f, 17f)
                horizontalLineTo(14f)
                close()
                moveTo(15f, 22f)
                curveTo(15f, 20.895f, 14.105f, 20f, 13f, 20f)
                verticalLineTo(21f)
                curveTo(13.552f, 21f, 14f, 21.448f, 14f, 22f)
                horizontalLineTo(15f)
                close()
                moveTo(19.25f, 19.5f)
                curveTo(19.25f, 18.534f, 18.466f, 17.75f, 17.5f, 17.75f)
                curveTo(16.534f, 17.75f, 15.75f, 18.534f, 15.75f, 19.5f)
                curveTo(15.75f, 20.466f, 16.534f, 21.25f, 17.5f, 21.25f)
                curveTo(18.466f, 21.25f, 19.25f, 20.466f, 19.25f, 19.5f)
                close()
            }
        }.build()

        return _BuildingRetailMoney!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingRetailMoney: ImageVector? = null

@Preview
@Composable
private fun BuildingRetailMoneyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BuildingRetailMoney, contentDescription = null)
    }
}
