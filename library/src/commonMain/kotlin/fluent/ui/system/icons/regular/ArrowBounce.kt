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

public val FluentUi.Regular.ArrowBounce: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowBounce",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.002f, 6.75f)
            curveTo(11.002f, 6.336f, 10.667f, 6f, 10.252f, 6f)
            horizontalLineTo(2.752f)
            curveTo(2.338f, 6f, 2.002f, 6.336f, 2.002f, 6.75f)
            verticalLineTo(14.25f)
            curveTo(2.002f, 14.664f, 2.338f, 15f, 2.752f, 15f)
            curveTo(3.166f, 15f, 3.502f, 14.664f, 3.502f, 14.25f)
            verticalLineTo(8.561f)
            lineTo(12.22f, 17.28f)
            curveTo(12.361f, 17.421f, 12.551f, 17.5f, 12.75f, 17.5f)
            curveTo(12.949f, 17.5f, 13.14f, 17.421f, 13.281f, 17.28f)
            lineTo(21.78f, 8.78f)
            curveTo(22.073f, 8.487f, 22.073f, 8.013f, 21.78f, 7.72f)
            curveTo(21.487f, 7.427f, 21.013f, 7.427f, 20.72f, 7.72f)
            lineTo(12.75f, 15.689f)
            lineTo(4.562f, 7.5f)
            horizontalLineTo(10.252f)
            curveTo(10.667f, 7.5f, 11.002f, 7.164f, 11.002f, 6.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowBouncePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowBounce, contentDescription = null)
    }
}
