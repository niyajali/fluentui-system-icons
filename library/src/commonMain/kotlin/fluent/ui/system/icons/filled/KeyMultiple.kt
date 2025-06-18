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

public val FluentUi.Filled.KeyMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.KeyMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.908f, 2.082f)
            curveTo(12.613f, 2.028f, 12.31f, 2f, 12f, 2f)
            curveTo(9.239f, 2f, 7f, 4.239f, 7f, 7f)
            curveTo(7f, 7.294f, 7.026f, 7.583f, 7.075f, 7.865f)
            lineTo(2.22f, 12.72f)
            curveTo(2.079f, 12.86f, 2f, 13.051f, 2f, 13.25f)
            verticalLineTo(17.25f)
            curveTo(2f, 17.664f, 2.336f, 18f, 2.75f, 18f)
            horizontalLineTo(6.25f)
            curveTo(6.664f, 18f, 7f, 17.664f, 7f, 17.25f)
            verticalLineTo(15.5f)
            horizontalLineTo(9.25f)
            curveTo(9.664f, 15.5f, 10f, 15.164f, 10f, 14.75f)
            verticalLineTo(13.061f)
            lineTo(11.458f, 11.603f)
            curveTo(10.547f, 10.484f, 10f, 9.056f, 10f, 7.5f)
            curveTo(10f, 5.238f, 11.155f, 3.246f, 12.908f, 2.082f)
            close()
            moveTo(11f, 7.5f)
            curveTo(11f, 4.462f, 13.462f, 2f, 16.5f, 2f)
            curveTo(19.538f, 2f, 22f, 4.462f, 22f, 7.5f)
            curveTo(22f, 9.432f, 21.004f, 11.13f, 19.5f, 12.11f)
            verticalLineTo(14.69f)
            lineTo(20.776f, 15.97f)
            curveTo(21.068f, 16.263f, 21.068f, 16.737f, 20.776f, 17.029f)
            lineTo(19.809f, 18f)
            lineTo(20.776f, 18.971f)
            curveTo(20.924f, 19.119f, 21.003f, 19.322f, 20.995f, 19.531f)
            curveTo(20.986f, 19.741f, 20.89f, 19.937f, 20.73f, 20.072f)
            lineTo(17.485f, 22.822f)
            curveTo(17.198f, 23.066f, 16.774f, 23.058f, 16.496f, 22.805f)
            lineTo(13.745f, 20.305f)
            curveTo(13.589f, 20.163f, 13.5f, 19.961f, 13.5f, 19.75f)
            verticalLineTo(12.11f)
            curveTo(11.996f, 11.13f, 11f, 9.432f, 11f, 7.5f)
            close()
            moveTo(17.5f, 6.5f)
            curveTo(17.5f, 5.948f, 17.052f, 5.5f, 16.5f, 5.5f)
            curveTo(15.948f, 5.5f, 15.5f, 5.948f, 15.5f, 6.5f)
            curveTo(15.5f, 7.052f, 15.948f, 7.5f, 16.5f, 7.5f)
            curveTo(17.052f, 7.5f, 17.5f, 7.052f, 17.5f, 6.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun KeyMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.KeyMultiple, contentDescription = null)
    }
}
