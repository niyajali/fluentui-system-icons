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

public val FluentIcons.Filled.PanelRightContract: ImageVector
    get() {
        if (_PanelRightContract != null) {
            return _PanelRightContract!!
        }
        _PanelRightContract = ImageVector.Builder(
            name = "Filled.PanelRightContract",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.193f, 9.248f)
                curveTo(9.47f, 8.94f, 9.944f, 8.915f, 10.252f, 9.193f)
                lineTo(12.752f, 11.443f)
                curveTo(12.91f, 11.585f, 13f, 11.787f, 13f, 12f)
                curveTo(13f, 12.213f, 12.91f, 12.415f, 12.752f, 12.557f)
                lineTo(10.252f, 14.807f)
                curveTo(9.944f, 15.085f, 9.47f, 15.06f, 9.193f, 14.752f)
                curveTo(8.915f, 14.444f, 8.94f, 13.97f, 9.248f, 13.693f)
                lineTo(10.295f, 12.75f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 12.75f, 6f, 12.414f, 6f, 12f)
                curveTo(6f, 11.586f, 6.336f, 11.25f, 6.75f, 11.25f)
                horizontalLineTo(10.295f)
                lineTo(9.248f, 10.307f)
                curveTo(8.94f, 10.03f, 8.915f, 9.556f, 9.193f, 9.248f)
                close()
                moveTo(22f, 17.25f)
                curveTo(22f, 18.769f, 20.769f, 20f, 19.25f, 20f)
                lineTo(4.75f, 20f)
                curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
                lineTo(22f, 17.25f)
                close()
                moveTo(15.002f, 18.5f)
                lineTo(15.002f, 5.5f)
                lineTo(4.75f, 5.5f)
                curveTo(4.06f, 5.5f, 3.5f, 6.06f, 3.5f, 6.75f)
                lineTo(3.5f, 17.25f)
                curveTo(3.5f, 17.94f, 4.06f, 18.5f, 4.75f, 18.5f)
                lineTo(15.002f, 18.5f)
                close()
            }
        }.build()

        return _PanelRightContract!!
    }

@Suppress("ObjectPropertyName")
private var _PanelRightContract: ImageVector? = null

@Preview
@Composable
private fun PanelRightContractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PanelRightContract, contentDescription = null)
    }
}
