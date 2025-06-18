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

public val FluentIcons.Regular.List: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.List",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 5.75f)
            curveTo(2f, 5.336f, 2.336f, 5f, 2.75f, 5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 5f, 19f, 5.336f, 19f, 5.75f)
            curveTo(19f, 6.164f, 18.664f, 6.5f, 18.25f, 6.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 6.5f, 2f, 6.164f, 2f, 5.75f)
            close()
            moveTo(2f, 17.75f)
            curveTo(2f, 17.336f, 2.336f, 17f, 2.75f, 17f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 17f, 16f, 17.336f, 16f, 17.75f)
            curveTo(16f, 18.164f, 15.664f, 18.5f, 15.25f, 18.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 18.5f, 2f, 18.164f, 2f, 17.75f)
            close()
            moveTo(2.75f, 11f)
            curveTo(2.336f, 11f, 2f, 11.336f, 2f, 11.75f)
            curveTo(2f, 12.164f, 2.336f, 12.5f, 2.75f, 12.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 12.5f, 22f, 12.164f, 22f, 11.75f)
            curveTo(22f, 11.336f, 21.664f, 11f, 21.25f, 11f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.List, contentDescription = null)
    }
}
