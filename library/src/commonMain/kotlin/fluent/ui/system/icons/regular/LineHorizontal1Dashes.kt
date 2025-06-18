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

public val FluentIcons.Regular.LineHorizontal1Dashes: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineHorizontal1Dashes",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 11.75f)
            curveTo(2f, 11.336f, 2.336f, 11f, 2.75f, 11f)
            horizontalLineTo(6.25f)
            curveTo(6.664f, 11f, 7f, 11.336f, 7f, 11.75f)
            curveTo(7f, 12.164f, 6.664f, 12.5f, 6.25f, 12.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 12.5f, 2f, 12.164f, 2f, 11.75f)
            close()
            moveTo(9.5f, 11.75f)
            curveTo(9.5f, 11.336f, 9.836f, 11f, 10.25f, 11f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 11f, 14.5f, 11.336f, 14.5f, 11.75f)
            curveTo(14.5f, 12.164f, 14.164f, 12.5f, 13.75f, 12.5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 12.5f, 9.5f, 12.164f, 9.5f, 11.75f)
            close()
            moveTo(17f, 11.75f)
            curveTo(17f, 11.336f, 17.336f, 11f, 17.75f, 11f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 11f, 22f, 11.336f, 22f, 11.75f)
            curveTo(22f, 12.164f, 21.664f, 12.5f, 21.25f, 12.5f)
            horizontalLineTo(17.75f)
            curveTo(17.336f, 12.5f, 17f, 12.164f, 17f, 11.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LineHorizontal1DashesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LineHorizontal1Dashes, contentDescription = null)
    }
}
