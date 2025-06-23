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

public val FluentIcons.Regular.BuildingRetailShield: ImageVector
    get() {
        if (_BuildingRetailShield != null) {
            return _BuildingRetailShield!!
        }
        _BuildingRetailShield = ImageVector.Builder(
            name = "Regular.BuildingRetailShield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.5f, 19.5f)
                horizontalLineTo(12.467f)
                curveTo(12.692f, 20.062f, 12.984f, 20.56f, 13.315f, 21f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 21f, 3f, 20.664f, 3f, 20.25f)
                verticalLineTo(6.732f)
                curveTo(2.402f, 6.387f, 2f, 5.74f, 2f, 5f)
                curveTo(2f, 3.895f, 2.895f, 3f, 4f, 3f)
                horizontalLineTo(20f)
                curveTo(21.105f, 3f, 22f, 3.895f, 22f, 5f)
                curveTo(22f, 5.74f, 21.598f, 6.387f, 21f, 6.732f)
                verticalLineTo(11.572f)
                curveTo(20.406f, 11.324f, 19.894f, 11.003f, 19.5f, 10.715f)
                verticalLineTo(7f)
                horizontalLineTo(4.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(6f)
                verticalLineTo(14.75f)
                curveTo(6f, 14.336f, 6.336f, 14f, 6.75f, 14f)
                horizontalLineTo(10.75f)
                curveTo(11.164f, 14f, 11.5f, 14.336f, 11.5f, 14.75f)
                verticalLineTo(19.5f)
                close()
                moveTo(3.5f, 5f)
                curveTo(3.5f, 5.276f, 3.724f, 5.5f, 4f, 5.5f)
                horizontalLineTo(20f)
                curveTo(20.276f, 5.5f, 20.5f, 5.276f, 20.5f, 5f)
                curveTo(20.5f, 4.724f, 20.276f, 4.5f, 20f, 4.5f)
                horizontalLineTo(4f)
                curveTo(3.724f, 4.5f, 3.5f, 4.724f, 3.5f, 5f)
                close()
                moveTo(7.5f, 15.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(10f)
                verticalLineTo(15.5f)
                horizontalLineTo(7.5f)
                close()
                moveTo(6.75f, 8f)
                curveTo(6.336f, 8f, 6f, 8.336f, 6f, 8.75f)
                verticalLineTo(12.25f)
                curveTo(6f, 12.664f, 6.336f, 13f, 6.75f, 13f)
                horizontalLineTo(12.084f)
                curveTo(12.287f, 12.421f, 12.831f, 12.034f, 13.41f, 11.981f)
                curveTo(14.047f, 11.924f, 14.642f, 11.737f, 15.167f, 11.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(10.715f)
                curveTo(16.681f, 10.582f, 16.837f, 10.456f, 16.965f, 10.347f)
                curveTo(17.26f, 10.094f, 17.63f, 9.967f, 18f, 9.967f)
                verticalLineTo(8.75f)
                curveTo(18f, 8.336f, 17.664f, 8f, 17.25f, 8f)
                horizontalLineTo(6.75f)
                close()
                moveTo(18.385f, 11.106f)
                curveTo(19.066f, 11.691f, 20.594f, 12.805f, 22.501f, 12.977f)
                curveTo(22.776f, 13.002f, 23f, 13.224f, 23f, 13.5f)
                lineTo(23f, 17f)
                curveTo(23f, 21.222f, 18.907f, 22.716f, 18.128f, 22.962f)
                curveTo(18.044f, 22.988f, 17.956f, 22.988f, 17.873f, 22.962f)
                curveTo(17.094f, 22.716f, 13f, 21.222f, 13f, 17f)
                lineTo(13f, 13.5f)
                curveTo(13f, 13.224f, 13.225f, 13.002f, 13.5f, 12.977f)
                curveTo(15.406f, 12.805f, 16.934f, 11.69f, 17.615f, 11.106f)
                curveTo(17.832f, 10.92f, 18.169f, 10.92f, 18.385f, 11.106f)
                close()
            }
        }.build()

        return _BuildingRetailShield!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingRetailShield: ImageVector? = null

@Preview
@Composable
private fun BuildingRetailShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BuildingRetailShield, contentDescription = null)
    }
}
