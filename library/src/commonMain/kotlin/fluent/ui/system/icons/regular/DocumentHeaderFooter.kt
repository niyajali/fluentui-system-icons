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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.DocumentHeaderFooter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentHeaderFooter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.005f, 6.505f)
            curveTo(7.005f, 5.676f, 7.677f, 5.004f, 8.505f, 5.004f)
            horizontalLineTo(15.505f)
            curveTo(16.334f, 5.004f, 17.005f, 5.676f, 17.005f, 6.505f)
            curveTo(17.005f, 7.333f, 16.334f, 8.005f, 15.505f, 8.005f)
            horizontalLineTo(8.505f)
            curveTo(7.677f, 8.005f, 7.005f, 7.333f, 7.005f, 6.505f)
            close()
            moveTo(7.005f, 17.506f)
            curveTo(7.005f, 16.677f, 7.677f, 16.006f, 8.505f, 16.006f)
            horizontalLineTo(15.505f)
            curveTo(16.334f, 16.006f, 17.005f, 16.677f, 17.005f, 17.506f)
            curveTo(17.005f, 18.334f, 16.334f, 19.006f, 15.505f, 19.006f)
            horizontalLineTo(8.505f)
            curveTo(7.677f, 19.006f, 7.005f, 18.334f, 7.005f, 17.506f)
            close()
            moveTo(19.995f, 4.096f)
            curveTo(19.916f, 2.925f, 18.941f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            lineTo(6.096f, 2.005f)
            curveTo(4.925f, 2.084f, 4f, 3.059f, 4f, 4.25f)
            verticalLineTo(19.75f)
            lineTo(4.005f, 19.904f)
            curveTo(4.084f, 21.075f, 5.059f, 22f, 6.25f, 22f)
            horizontalLineTo(17.75f)
            lineTo(17.904f, 21.995f)
            curveTo(19.075f, 21.916f, 20f, 20.941f, 20f, 19.75f)
            verticalLineTo(4.25f)
            lineTo(19.995f, 4.096f)
            close()
            moveTo(6.25f, 3.5f)
            horizontalLineTo(17.75f)
            lineTo(17.852f, 3.507f)
            curveTo(18.218f, 3.557f, 18.5f, 3.87f, 18.5f, 4.25f)
            verticalLineTo(19.75f)
            lineTo(18.493f, 19.852f)
            curveTo(18.444f, 20.218f, 18.13f, 20.5f, 17.75f, 20.5f)
            horizontalLineTo(6.25f)
            lineTo(6.148f, 20.493f)
            curveTo(5.782f, 20.443f, 5.5f, 20.129f, 5.5f, 19.75f)
            verticalLineTo(4.25f)
            lineTo(5.507f, 4.148f)
            curveTo(5.557f, 3.782f, 5.87f, 3.5f, 6.25f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentHeaderFooterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentHeaderFooter, contentDescription = null)
    }
}
