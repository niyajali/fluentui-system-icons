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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.SportAmericanFootball: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SportAmericanFootball",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.379f, 11.5f)
            curveTo(19.949f, 16.26f, 16.18f, 20.007f, 11.406f, 21.406f)
            lineTo(2.594f, 12.594f)
            curveTo(3.993f, 7.821f, 7.74f, 4.051f, 12.5f, 2.621f)
            lineTo(21.379f, 11.5f)
            close()
            moveTo(13.72f, 9.22f)
            lineTo(9.22f, 13.72f)
            curveTo(8.927f, 14.013f, 8.927f, 14.487f, 9.22f, 14.78f)
            curveTo(9.513f, 15.073f, 9.987f, 15.073f, 10.28f, 14.78f)
            lineTo(14.78f, 10.28f)
            curveTo(15.073f, 9.987f, 15.073f, 9.513f, 14.78f, 9.22f)
            curveTo(14.487f, 8.927f, 14.013f, 8.927f, 13.72f, 9.22f)
            close()
            moveTo(2.199f, 14.32f)
            lineTo(9.68f, 21.801f)
            curveTo(8.889f, 21.932f, 8.078f, 22f, 7.25f, 22f)
            horizontalLineTo(6.25f)
            curveTo(3.903f, 22f, 2f, 20.097f, 2f, 17.75f)
            verticalLineTo(16.75f)
            curveTo(2f, 15.922f, 2.068f, 15.111f, 2.199f, 14.32f)
            close()
            moveTo(14.217f, 2.217f)
            lineTo(21.783f, 9.783f)
            curveTo(21.926f, 8.96f, 22f, 8.114f, 22f, 7.25f)
            verticalLineTo(6.25f)
            curveTo(22f, 3.903f, 20.097f, 2f, 17.75f, 2f)
            horizontalLineTo(16.75f)
            curveTo(15.886f, 2f, 15.04f, 2.074f, 14.217f, 2.217f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SportAmericanFootballPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SportAmericanFootball, contentDescription = null)
    }
}
