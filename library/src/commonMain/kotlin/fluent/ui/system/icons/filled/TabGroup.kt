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

public val FluentIcons.Filled.TabGroup: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabGroup",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.75f, 5f)
            curveTo(3.231f, 5f, 2f, 6.231f, 2f, 7.75f)
            verticalLineTo(13.25f)
            curveTo(2f, 14.769f, 3.231f, 16f, 4.75f, 16f)
            horizontalLineTo(17.25f)
            curveTo(18.769f, 16f, 20f, 14.769f, 20f, 13.25f)
            verticalLineTo(7.75f)
            curveTo(20f, 6.231f, 18.769f, 5f, 17.25f, 5f)
            horizontalLineTo(4.75f)
            close()
            moveTo(6.5f, 10.5f)
            curveTo(6.5f, 10.086f, 6.836f, 9.75f, 7.25f, 9.75f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 9.75f, 15.5f, 10.086f, 15.5f, 10.5f)
            curveTo(15.5f, 10.914f, 15.164f, 11.25f, 14.75f, 11.25f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 11.25f, 6.5f, 10.914f, 6.5f, 10.5f)
            close()
            moveTo(7.247f, 18.499f)
            curveTo(6.178f, 18.499f, 5.252f, 17.89f, 4.797f, 17f)
            horizontalLineTo(17.25f)
            curveTo(19.321f, 17f, 21f, 15.321f, 21f, 13.25f)
            verticalLineTo(7.801f)
            curveTo(21.889f, 8.257f, 22.497f, 9.182f, 22.497f, 10.249f)
            verticalLineTo(13.249f)
            curveTo(22.497f, 16.149f, 20.146f, 18.499f, 17.247f, 18.499f)
            horizontalLineTo(7.247f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TabGroupPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TabGroup, contentDescription = null)
    }
}
