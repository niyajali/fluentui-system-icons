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

public val FluentIcons.Regular.Payment: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Payment",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.75f, 14.5f)
            curveTo(15.336f, 14.5f, 15f, 14.836f, 15f, 15.25f)
            curveTo(15f, 15.664f, 15.336f, 16f, 15.75f, 16f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 16f, 19f, 15.664f, 19f, 15.25f)
            curveTo(19f, 14.836f, 18.664f, 14.5f, 18.25f, 14.5f)
            horizontalLineTo(15.75f)
            close()
            moveTo(2f, 8.25f)
            curveTo(2f, 6.455f, 3.455f, 5f, 5.25f, 5f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 5f, 22f, 6.455f, 22f, 8.25f)
            verticalLineTo(15.75f)
            curveTo(22f, 17.545f, 20.545f, 19f, 18.75f, 19f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 19f, 2f, 17.545f, 2f, 15.75f)
            verticalLineTo(8.25f)
            close()
            moveTo(20.5f, 9.5f)
            verticalLineTo(8.25f)
            curveTo(20.5f, 7.284f, 19.716f, 6.5f, 18.75f, 6.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 6.5f, 3.5f, 7.284f, 3.5f, 8.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(20.5f)
            close()
            moveTo(3.5f, 11f)
            verticalLineTo(15.75f)
            curveTo(3.5f, 16.716f, 4.284f, 17.5f, 5.25f, 17.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 17.5f, 20.5f, 16.716f, 20.5f, 15.75f)
            verticalLineTo(11f)
            horizontalLineTo(3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaymentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Payment, contentDescription = null)
    }
}
