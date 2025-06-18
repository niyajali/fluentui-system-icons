/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.DrawerPlay: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DrawerPlay",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 6.5f)
            curveTo(22f, 9.538f, 19.538f, 12f, 16.5f, 12f)
            curveTo(13.462f, 12f, 11f, 9.538f, 11f, 6.5f)
            curveTo(11f, 3.462f, 13.462f, 1f, 16.5f, 1f)
            curveTo(19.538f, 1f, 22f, 3.462f, 22f, 6.5f)
            close()
            moveTo(15f, 8.615f)
            curveTo(15f, 9.004f, 15.424f, 9.244f, 15.757f, 9.044f)
            lineTo(19.285f, 6.927f)
            curveTo(19.609f, 6.733f, 19.609f, 6.263f, 19.285f, 6.069f)
            lineTo(15.757f, 3.952f)
            curveTo(15.424f, 3.752f, 15f, 3.992f, 15f, 4.381f)
            verticalLineTo(8.615f)
            close()
            moveTo(21f, 11.19f)
            curveTo(20.556f, 11.617f, 20.051f, 11.981f, 19.5f, 12.268f)
            verticalLineTo(14f)
            horizontalLineTo(14.942f)
            curveTo(14.56f, 14f, 14.25f, 14.31f, 14.25f, 14.692f)
            verticalLineTo(14.75f)
            curveTo(14.25f, 15.993f, 13.243f, 17f, 12f, 17f)
            curveTo(10.757f, 17f, 9.75f, 15.993f, 9.75f, 14.75f)
            verticalLineTo(14.692f)
            curveTo(9.75f, 14.31f, 9.44f, 14f, 9.058f, 14f)
            horizontalLineTo(4.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(10.732f)
            curveTo(10.488f, 9.031f, 10.299f, 8.528f, 10.174f, 8f)
            horizontalLineTo(4.5f)
            verticalLineTo(7.25f)
            curveTo(4.5f, 6.284f, 5.284f, 5.5f, 6.25f, 5.5f)
            horizontalLineTo(10.076f)
            curveTo(10.157f, 4.977f, 10.3f, 4.474f, 10.498f, 4f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 4f, 3f, 5.455f, 3f, 7.25f)
            verticalLineTo(18.75f)
            curveTo(3f, 20.545f, 4.455f, 22f, 6.25f, 22f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 22f, 21f, 20.545f, 21f, 18.75f)
            verticalLineTo(11.19f)
            close()
            moveTo(19.5f, 15.5f)
            verticalLineTo(18.75f)
            curveTo(19.5f, 19.716f, 18.716f, 20.5f, 17.75f, 20.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 20.5f, 4.5f, 19.716f, 4.5f, 18.75f)
            verticalLineTo(15.5f)
            horizontalLineTo(8.325f)
            curveTo(8.672f, 17.212f, 10.186f, 18.5f, 12f, 18.5f)
            curveTo(13.814f, 18.5f, 15.328f, 17.212f, 15.675f, 15.5f)
            horizontalLineTo(19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DrawerPlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DrawerPlay, contentDescription = null)
    }
}
