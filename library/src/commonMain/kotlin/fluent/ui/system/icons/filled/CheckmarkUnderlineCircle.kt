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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.CheckmarkUnderlineCircle: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CheckmarkUnderlineCircle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            close()
            moveTo(10.75f, 11.439f)
            lineTo(15.22f, 6.97f)
            curveTo(15.513f, 6.677f, 15.987f, 6.677f, 16.28f, 6.97f)
            curveTo(16.547f, 7.236f, 16.571f, 7.653f, 16.353f, 7.946f)
            lineTo(16.28f, 8.03f)
            lineTo(11.28f, 13.03f)
            curveTo(11.014f, 13.297f, 10.597f, 13.321f, 10.304f, 13.103f)
            lineTo(10.22f, 13.03f)
            lineTo(7.72f, 10.53f)
            curveTo(7.427f, 10.237f, 7.427f, 9.763f, 7.72f, 9.47f)
            curveTo(7.986f, 9.203f, 8.403f, 9.179f, 8.696f, 9.397f)
            lineTo(8.78f, 9.47f)
            lineTo(10.75f, 11.439f)
            close()
            moveTo(8.5f, 15f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 15f, 16f, 15.336f, 16f, 15.75f)
            curveTo(16f, 16.164f, 15.664f, 16.5f, 15.25f, 16.5f)
            horizontalLineTo(8.5f)
            curveTo(8.086f, 16.5f, 7.75f, 16.164f, 7.75f, 15.75f)
            curveTo(7.75f, 15.336f, 8.086f, 15f, 8.5f, 15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CheckmarkUnderlineCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CheckmarkUnderlineCircle, contentDescription = null)
    }
}
