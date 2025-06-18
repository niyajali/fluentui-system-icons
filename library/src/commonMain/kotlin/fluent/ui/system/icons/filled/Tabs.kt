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

public val FluentIcons.Filled.Tabs: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tabs",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 9.25f)
            curveTo(2f, 5.246f, 5.246f, 2f, 9.25f, 2f)
            horizontalLineTo(12.75f)
            curveTo(14.102f, 2f, 15.261f, 2.826f, 15.751f, 4f)
            lineTo(10.25f, 4f)
            curveTo(6.798f, 4f, 4f, 6.798f, 4f, 10.25f)
            verticalLineTo(15.75f)
            curveTo(2.826f, 15.26f, 2f, 14.102f, 2f, 12.75f)
            verticalLineTo(9.25f)
            close()
            moveTo(5f, 10.25f)
            curveTo(5f, 7.351f, 7.351f, 5f, 10.25f, 5f)
            horizontalLineTo(15.75f)
            curveTo(17.102f, 5f, 18.261f, 5.826f, 18.751f, 7f)
            lineTo(11.25f, 7f)
            curveTo(8.903f, 7f, 7f, 8.903f, 7f, 11.25f)
            verticalLineTo(18.75f)
            curveTo(5.826f, 18.26f, 5f, 17.102f, 5f, 15.75f)
            verticalLineTo(10.25f)
            close()
            moveTo(11.25f, 8f)
            curveTo(9.455f, 8f, 8f, 9.455f, 8f, 11.25f)
            verticalLineTo(18.75f)
            curveTo(8f, 20.545f, 9.455f, 22f, 11.25f, 22f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
            verticalLineTo(11.25f)
            curveTo(22f, 9.455f, 20.545f, 8f, 18.75f, 8f)
            horizontalLineTo(11.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TabsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Tabs, contentDescription = null)
    }
}
