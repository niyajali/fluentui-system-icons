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

public val FluentUi.Filled.TextboxAlignMiddleRotate90: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextboxAlignMiddleRotate90",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 5.75f)
            curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
            lineTo(5.75f, 3f)
            curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
            lineTo(3f, 18.25f)
            curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
            horizontalLineTo(18.25f)
            curveTo(19.769f, 21f, 21f, 19.769f, 21f, 18.25f)
            verticalLineTo(5.75f)
            close()
            moveTo(15f, 7.25f)
            lineTo(15f, 16.75f)
            curveTo(15f, 17.164f, 14.664f, 17.5f, 14.25f, 17.5f)
            curveTo(13.836f, 17.5f, 13.5f, 17.164f, 13.5f, 16.75f)
            lineTo(13.5f, 7.25f)
            curveTo(13.5f, 6.836f, 13.836f, 6.5f, 14.25f, 6.5f)
            curveTo(14.664f, 6.5f, 15f, 6.836f, 15f, 7.25f)
            close()
            moveTo(11f, 7.25f)
            lineTo(11f, 16.75f)
            curveTo(11f, 17.164f, 10.664f, 17.5f, 10.25f, 17.5f)
            curveTo(9.836f, 17.5f, 9.5f, 17.164f, 9.5f, 16.75f)
            lineTo(9.5f, 7.25f)
            curveTo(9.5f, 6.836f, 9.836f, 6.5f, 10.25f, 6.5f)
            curveTo(10.664f, 6.5f, 11f, 6.836f, 11f, 7.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextboxAlignMiddleRotate90Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextboxAlignMiddleRotate90, contentDescription = null)
    }
}
