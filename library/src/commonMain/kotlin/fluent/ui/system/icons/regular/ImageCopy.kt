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

public val FluentUi.Regular.ImageCopy: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageCopy",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.507f, 6.008f)
            curveTo(3.601f, 6.583f, 3f, 7.596f, 3f, 8.75f)
            verticalLineTo(15.25f)
            curveTo(3f, 18.149f, 5.351f, 20.5f, 8.25f, 20.5f)
            horizontalLineTo(14.75f)
            curveTo(15.904f, 20.5f, 16.917f, 19.899f, 17.494f, 18.993f)
            lineTo(17.372f, 18.998f)
            lineTo(17.25f, 19f)
            horizontalLineTo(8.25f)
            curveTo(6.179f, 19f, 4.5f, 17.321f, 4.5f, 15.25f)
            verticalLineTo(6.25f)
            curveTo(4.5f, 6.169f, 4.502f, 6.088f, 4.507f, 6.008f)
            close()
            moveTo(8.75f, 3f)
            curveTo(6.955f, 3f, 5.5f, 4.455f, 5.5f, 6.25f)
            verticalLineTo(14.75f)
            curveTo(5.5f, 16.545f, 6.955f, 18f, 8.75f, 18f)
            horizontalLineTo(17.25f)
            curveTo(19.045f, 18f, 20.5f, 16.545f, 20.5f, 14.75f)
            verticalLineTo(6.25f)
            curveTo(20.5f, 4.455f, 19.045f, 3f, 17.25f, 3f)
            horizontalLineTo(8.75f)
            close()
            moveTo(13.431f, 12.137f)
            lineTo(13.523f, 12.214f)
            lineTo(17.83f, 16.402f)
            curveTo(17.648f, 16.465f, 17.453f, 16.5f, 17.25f, 16.5f)
            horizontalLineTo(8.75f)
            curveTo(8.547f, 16.5f, 8.352f, 16.465f, 8.17f, 16.402f)
            lineTo(12.477f, 12.214f)
            curveTo(12.739f, 11.959f, 13.141f, 11.934f, 13.431f, 12.137f)
            close()
            moveTo(8.75f, 4.5f)
            horizontalLineTo(17.25f)
            curveTo(18.216f, 4.5f, 19f, 5.284f, 19f, 6.25f)
            verticalLineTo(14.75f)
            curveTo(19f, 14.959f, 18.963f, 15.159f, 18.896f, 15.345f)
            lineTo(14.569f, 11.138f)
            curveTo(13.739f, 10.332f, 12.443f, 10.291f, 11.566f, 11.017f)
            lineTo(11.432f, 11.138f)
            lineTo(7.104f, 15.346f)
            curveTo(7.037f, 15.16f, 7f, 14.959f, 7f, 14.75f)
            verticalLineTo(6.25f)
            curveTo(7f, 5.284f, 7.784f, 4.5f, 8.75f, 4.5f)
            close()
            moveTo(10.5f, 6.751f)
            curveTo(9.81f, 6.751f, 9.25f, 7.31f, 9.25f, 8f)
            curveTo(9.25f, 8.69f, 9.81f, 9.25f, 10.5f, 9.25f)
            curveTo(11.189f, 9.25f, 11.749f, 8.69f, 11.749f, 8f)
            curveTo(11.749f, 7.31f, 11.189f, 6.751f, 10.5f, 6.751f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageCopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ImageCopy, contentDescription = null)
    }
}
