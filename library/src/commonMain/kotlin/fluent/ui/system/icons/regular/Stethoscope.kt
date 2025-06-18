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

public val FluentUi.Regular.Stethoscope: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Stethoscope",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.75f, 2.5f)
            curveTo(2.336f, 2.5f, 2f, 2.836f, 2f, 3.25f)
            verticalLineTo(9f)
            curveTo(2f, 12.06f, 4.29f, 14.585f, 7.25f, 14.954f)
            verticalLineTo(15.75f)
            curveTo(7.25f, 19.064f, 9.936f, 21.75f, 13.25f, 21.75f)
            curveTo(16.564f, 21.75f, 19.25f, 19.064f, 19.25f, 15.75f)
            verticalLineTo(14.906f)
            curveTo(20.544f, 14.573f, 21.5f, 13.398f, 21.5f, 12f)
            curveTo(21.5f, 10.343f, 20.157f, 9f, 18.5f, 9f)
            curveTo(16.843f, 9f, 15.5f, 10.343f, 15.5f, 12f)
            curveTo(15.5f, 13.398f, 16.456f, 14.573f, 17.75f, 14.906f)
            verticalLineTo(15.75f)
            curveTo(17.75f, 18.235f, 15.735f, 20.25f, 13.25f, 20.25f)
            curveTo(10.765f, 20.25f, 8.75f, 18.235f, 8.75f, 15.75f)
            verticalLineTo(14.954f)
            curveTo(11.71f, 14.585f, 14f, 12.06f, 14f, 9f)
            verticalLineTo(3.25f)
            curveTo(14f, 2.836f, 13.664f, 2.5f, 13.25f, 2.5f)
            horizontalLineTo(10.75f)
            curveTo(10.336f, 2.5f, 10f, 2.836f, 10f, 3.25f)
            curveTo(10f, 3.664f, 10.336f, 4f, 10.75f, 4f)
            horizontalLineTo(12.5f)
            verticalLineTo(9f)
            curveTo(12.5f, 11.485f, 10.485f, 13.5f, 8f, 13.5f)
            curveTo(5.515f, 13.5f, 3.5f, 11.485f, 3.5f, 9f)
            verticalLineTo(4f)
            horizontalLineTo(5.25f)
            curveTo(5.664f, 4f, 6f, 3.664f, 6f, 3.25f)
            curveTo(6f, 2.836f, 5.664f, 2.5f, 5.25f, 2.5f)
            horizontalLineTo(2.75f)
            close()
            moveTo(18.5f, 10.5f)
            curveTo(19.328f, 10.5f, 20f, 11.172f, 20f, 12f)
            curveTo(20f, 12.828f, 19.328f, 13.5f, 18.5f, 13.5f)
            curveTo(17.672f, 13.5f, 17f, 12.828f, 17f, 12f)
            curveTo(17f, 11.172f, 17.672f, 10.5f, 18.5f, 10.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StethoscopePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Stethoscope, contentDescription = null)
    }
}
