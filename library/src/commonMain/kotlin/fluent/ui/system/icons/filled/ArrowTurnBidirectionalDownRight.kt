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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ArrowTurnBidirectionalDownRight: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.ArrowTurnBidirectionalDownRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.707f, 3.293f)
                curveTo(17.317f, 2.902f, 16.683f, 2.902f, 16.293f, 3.293f)
                curveTo(15.902f, 3.683f, 15.902f, 4.317f, 16.293f, 4.707f)
                lineTo(18.587f, 7.001f)
                horizontalLineTo(11.5f)
                curveTo(9.015f, 7.001f, 7f, 9.016f, 7f, 11.501f)
                verticalLineTo(18.587f)
                lineTo(4.707f, 16.294f)
                curveTo(4.316f, 15.904f, 3.683f, 15.904f, 3.293f, 16.294f)
                curveTo(2.902f, 16.685f, 2.902f, 17.318f, 3.293f, 17.708f)
                lineTo(7.293f, 21.708f)
                curveTo(7.684f, 22.099f, 8.317f, 22.099f, 8.708f, 21.708f)
                lineTo(12.707f, 17.708f)
                curveTo(13.098f, 17.318f, 13.098f, 16.685f, 12.707f, 16.294f)
                curveTo(12.317f, 15.904f, 11.683f, 15.904f, 11.293f, 16.294f)
                lineTo(9f, 18.587f)
                verticalLineTo(11.501f)
                curveTo(9f, 10.12f, 10.119f, 9.001f, 11.5f, 9.001f)
                horizontalLineTo(18.586f)
                lineTo(16.293f, 11.294f)
                curveTo(15.902f, 11.684f, 15.902f, 12.317f, 16.293f, 12.708f)
                curveTo(16.683f, 13.098f, 17.316f, 13.098f, 17.707f, 12.708f)
                lineTo(21.708f, 8.708f)
                curveTo(21.895f, 8.52f, 22.001f, 8.266f, 22.001f, 8.001f)
                curveTo(22.001f, 7.736f, 21.895f, 7.481f, 21.708f, 7.294f)
                lineTo(17.707f, 3.293f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun ArrowTurnBidirectionalDownRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowTurnBidirectionalDownRight, contentDescription = null)
    }
}
