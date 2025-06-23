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

public val FluentIcons.Filled.PanelLeftFocusRight: ImageVector
    get() {
        if (_PanelLeftFocusRight != null) {
            return _PanelLeftFocusRight!!
        }
        _PanelLeftFocusRight = ImageVector.Builder(
            name = "Filled.PanelLeftFocusRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.25f, 20f)
                curveTo(20.769f, 20f, 22f, 18.769f, 22f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
                lineTo(4.75f, 4f)
                curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
                lineTo(2f, 17.25f)
                curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
                lineTo(19.25f, 20f)
                close()
                moveTo(8f, 5.5f)
                lineTo(8f, 18.5f)
                lineTo(4.75f, 18.5f)
                curveTo(4.06f, 18.5f, 3.5f, 17.94f, 3.5f, 17.25f)
                lineTo(3.5f, 6.75f)
                curveTo(3.5f, 6.06f, 4.06f, 5.5f, 4.75f, 5.5f)
                lineTo(8f, 5.5f)
                close()
            }
        }.build()

        return _PanelLeftFocusRight!!
    }

@Suppress("ObjectPropertyName")
private var _PanelLeftFocusRight: ImageVector? = null

@Preview
@Composable
private fun PanelLeftFocusRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PanelLeftFocusRight, contentDescription = null)
    }
}
