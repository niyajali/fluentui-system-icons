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

public val FluentIcons.Filled.PanelLeftContract: ImageVector
    get() {
        if (_PanelLeftContract != null) {
            return _PanelLeftContract!!
        }
        _PanelLeftContract = ImageVector.Builder(
            name = "Filled.PanelLeftContract",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.807f, 9.248f)
                curveTo(14.53f, 8.94f, 14.056f, 8.915f, 13.748f, 9.193f)
                lineTo(11.248f, 11.443f)
                curveTo(11.09f, 11.585f, 11f, 11.787f, 11f, 12f)
                curveTo(11f, 12.213f, 11.09f, 12.415f, 11.248f, 12.557f)
                lineTo(13.748f, 14.807f)
                curveTo(14.056f, 15.085f, 14.53f, 15.06f, 14.807f, 14.752f)
                curveTo(15.085f, 14.444f, 15.06f, 13.97f, 14.752f, 13.693f)
                lineTo(13.705f, 12.75f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 12.75f, 18f, 12.414f, 18f, 12f)
                curveTo(18f, 11.586f, 17.664f, 11.25f, 17.25f, 11.25f)
                horizontalLineTo(13.705f)
                lineTo(14.752f, 10.307f)
                curveTo(15.06f, 10.03f, 15.085f, 9.556f, 14.807f, 9.248f)
                close()
                moveTo(2f, 6.75f)
                curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(22f, 18.769f, 20.769f, 20f, 19.25f, 20f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(8.998f, 5.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(19.25f)
                curveTo(19.94f, 18.5f, 20.5f, 17.94f, 20.5f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(20.5f, 6.06f, 19.94f, 5.5f, 19.25f, 5.5f)
                horizontalLineTo(8.998f)
                close()
            }
        }.build()

        return _PanelLeftContract!!
    }

@Suppress("ObjectPropertyName")
private var _PanelLeftContract: ImageVector? = null

@Preview
@Composable
private fun PanelLeftContractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PanelLeftContract, contentDescription = null)
    }
}
