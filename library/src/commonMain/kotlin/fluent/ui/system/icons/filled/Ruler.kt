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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.Ruler: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Ruler",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 4.25f)
            curveTo(7f, 3.007f, 8.007f, 2f, 9.25f, 2f)
            horizontalLineTo(14.75f)
            curveTo(15.993f, 2f, 17f, 3.007f, 17f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(17f, 20.993f, 15.993f, 22f, 14.75f, 22f)
            horizontalLineTo(9.25f)
            curveTo(9.095f, 22f, 8.943f, 21.984f, 8.797f, 21.954f)
            curveTo(7.771f, 21.744f, 7f, 20.837f, 7f, 19.75f)
            verticalLineTo(4.25f)
            close()
            moveTo(8.5f, 5f)
            verticalLineTo(6.5f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 6.5f, 11f, 6.164f, 11f, 5.75f)
            curveTo(11f, 5.336f, 10.664f, 5f, 10.25f, 5f)
            horizontalLineTo(8.5f)
            close()
            moveTo(8.5f, 8f)
            verticalLineTo(9.5f)
            horizontalLineTo(12.25f)
            curveTo(12.664f, 9.5f, 13f, 9.164f, 13f, 8.75f)
            curveTo(13f, 8.336f, 12.664f, 8f, 12.25f, 8f)
            horizontalLineTo(8.5f)
            close()
            moveTo(8.5f, 11.25f)
            verticalLineTo(12.75f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 12.75f, 11f, 12.414f, 11f, 12f)
            curveTo(11f, 11.586f, 10.664f, 11.25f, 10.25f, 11.25f)
            horizontalLineTo(8.5f)
            close()
            moveTo(8.5f, 14.5f)
            verticalLineTo(16f)
            horizontalLineTo(12.25f)
            curveTo(12.664f, 16f, 13f, 15.664f, 13f, 15.25f)
            curveTo(13f, 14.836f, 12.664f, 14.5f, 12.25f, 14.5f)
            horizontalLineTo(8.5f)
            close()
            moveTo(8.5f, 17.5f)
            verticalLineTo(19f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 19f, 11f, 18.664f, 11f, 18.25f)
            curveTo(11f, 17.836f, 10.664f, 17.5f, 10.25f, 17.5f)
            horizontalLineTo(8.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RulerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Ruler, contentDescription = null)
    }
}
