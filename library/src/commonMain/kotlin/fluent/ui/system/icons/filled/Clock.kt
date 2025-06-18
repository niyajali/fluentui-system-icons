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

public val FluentUi.Filled.Clock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Clock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.25f, 13.5f)
            horizontalLineTo(11.25f)
            curveTo(10.836f, 13.5f, 10.5f, 13.164f, 10.5f, 12.75f)
            verticalLineTo(6.75f)
            curveTo(10.5f, 6.336f, 10.836f, 6f, 11.25f, 6f)
            curveTo(11.664f, 6f, 12f, 6.336f, 12f, 6.75f)
            verticalLineTo(12f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 12f, 16f, 12.336f, 16f, 12.75f)
            curveTo(16f, 13.164f, 15.664f, 13.5f, 15.25f, 13.5f)
            close()
            moveTo(12f, 2f)
            curveTo(6.478f, 2f, 2f, 6.478f, 2f, 12f)
            curveTo(2f, 17.522f, 6.478f, 22f, 12f, 22f)
            curveTo(17.522f, 22f, 22f, 17.522f, 22f, 12f)
            curveTo(22f, 6.478f, 17.522f, 2f, 12f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Clock, contentDescription = null)
    }
}
