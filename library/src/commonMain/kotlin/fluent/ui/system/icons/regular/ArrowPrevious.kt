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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.ArrowPrevious: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowPrevious",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.75f, 3f)
            curveTo(5.37f, 3f, 5.057f, 3.282f, 5.007f, 3.648f)
            lineTo(5f, 3.75f)
            verticalLineTo(20.25f)
            curveTo(5f, 20.664f, 5.336f, 21f, 5.75f, 21f)
            curveTo(6.13f, 21f, 6.443f, 20.718f, 6.493f, 20.352f)
            lineTo(6.5f, 20.25f)
            verticalLineTo(3.75f)
            curveTo(6.5f, 3.336f, 6.164f, 3f, 5.75f, 3f)
            close()
            moveTo(18.78f, 3.22f)
            curveTo(18.514f, 2.953f, 18.097f, 2.929f, 17.804f, 3.147f)
            lineTo(17.72f, 3.22f)
            lineTo(9.47f, 11.47f)
            curveTo(9.203f, 11.736f, 9.179f, 12.153f, 9.397f, 12.446f)
            lineTo(9.47f, 12.53f)
            lineTo(17.72f, 20.78f)
            curveTo(18.013f, 21.073f, 18.487f, 21.073f, 18.78f, 20.78f)
            curveTo(19.047f, 20.514f, 19.071f, 20.097f, 18.853f, 19.804f)
            lineTo(18.78f, 19.72f)
            lineTo(11.061f, 12f)
            lineTo(18.78f, 4.28f)
            curveTo(19.073f, 3.987f, 19.073f, 3.513f, 18.78f, 3.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowPreviousPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowPrevious, contentDescription = null)
    }
}
