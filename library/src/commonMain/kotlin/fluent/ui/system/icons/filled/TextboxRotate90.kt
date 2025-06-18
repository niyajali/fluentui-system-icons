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

public val FluentUi.Filled.TextboxRotate90: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextboxRotate90",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.25f, 21f)
            curveTo(19.769f, 21f, 21f, 19.769f, 21f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
            lineTo(5.75f, 3f)
            curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
            lineTo(3f, 18.25f)
            curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
            horizontalLineTo(18.25f)
            close()
            moveTo(12.5f, 14.25f)
            curveTo(12.5f, 14.664f, 12.164f, 15f, 11.75f, 15f)
            curveTo(11.37f, 15f, 11.057f, 14.718f, 11.007f, 14.352f)
            lineTo(11f, 14.25f)
            lineTo(11f, 6.75f)
            curveTo(11f, 6.336f, 11.336f, 6f, 11.75f, 6f)
            curveTo(12.13f, 6f, 12.443f, 6.282f, 12.493f, 6.648f)
            lineTo(12.5f, 6.75f)
            lineTo(12.5f, 14.25f)
            close()
            moveTo(8.5f, 6.75f)
            lineTo(8.5f, 17.25f)
            curveTo(8.5f, 17.664f, 8.164f, 18f, 7.75f, 18f)
            curveTo(7.37f, 18f, 7.057f, 17.718f, 7.007f, 17.352f)
            lineTo(7f, 17.25f)
            lineTo(7f, 6.75f)
            curveTo(7f, 6.336f, 7.336f, 6f, 7.75f, 6f)
            curveTo(8.13f, 6f, 8.443f, 6.282f, 8.493f, 6.648f)
            lineTo(8.5f, 6.75f)
            close()
            moveTo(16.5f, 17.25f)
            curveTo(16.5f, 17.664f, 16.164f, 18f, 15.75f, 18f)
            curveTo(15.37f, 18f, 15.057f, 17.718f, 15.007f, 17.352f)
            lineTo(15f, 17.25f)
            lineTo(15f, 6.75f)
            curveTo(15f, 6.336f, 15.336f, 6f, 15.75f, 6f)
            curveTo(16.13f, 6f, 16.444f, 6.282f, 16.493f, 6.648f)
            lineTo(16.5f, 6.75f)
            lineTo(16.5f, 17.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextboxRotate90Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextboxRotate90, contentDescription = null)
    }
}
