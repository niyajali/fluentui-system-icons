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

public val FluentUi.Filled.DocumentTarget: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentTarget",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(20f)
            curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
            horizontalLineTo(8.682f)
            curveTo(9.831f, 21.442f, 10.734f, 20.456f, 11.185f, 19.25f)
            horizontalLineTo(11.25f)
            curveTo(12.217f, 19.25f, 13f, 18.466f, 13f, 17.5f)
            curveTo(13f, 16.534f, 12.217f, 15.75f, 11.25f, 15.75f)
            horizontalLineTo(11.185f)
            curveTo(10.679f, 14.396f, 9.604f, 13.321f, 8.25f, 12.815f)
            verticalLineTo(12.75f)
            curveTo(8.25f, 11.783f, 7.466f, 11f, 6.5f, 11f)
            curveTo(5.534f, 11f, 4.75f, 11.783f, 4.75f, 12.75f)
            verticalLineTo(12.815f)
            curveTo(4.489f, 12.912f, 4.238f, 13.031f, 4f, 13.169f)
            verticalLineTo(4f)
            curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
            horizontalLineTo(12f)
            close()
            moveTo(13.5f, 2.5f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(19.5f)
            lineTo(13.5f, 2.5f)
            close()
            moveTo(7.25f, 12.75f)
            curveTo(7.25f, 12.336f, 6.914f, 12f, 6.5f, 12f)
            curveTo(6.086f, 12f, 5.75f, 12.336f, 5.75f, 12.75f)
            verticalLineTo(13.316f)
            curveTo(4.004f, 13.627f, 2.627f, 15.004f, 2.316f, 16.75f)
            horizontalLineTo(1.75f)
            curveTo(1.336f, 16.75f, 1f, 17.086f, 1f, 17.5f)
            curveTo(1f, 17.914f, 1.336f, 18.25f, 1.75f, 18.25f)
            horizontalLineTo(2.316f)
            curveTo(2.627f, 19.996f, 4.004f, 21.373f, 5.75f, 21.684f)
            verticalLineTo(22.25f)
            curveTo(5.75f, 22.664f, 6.086f, 23f, 6.5f, 23f)
            curveTo(6.914f, 23f, 7.25f, 22.664f, 7.25f, 22.25f)
            verticalLineTo(21.684f)
            curveTo(8.996f, 21.373f, 10.373f, 19.996f, 10.684f, 18.25f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 18.25f, 12f, 17.914f, 12f, 17.5f)
            curveTo(12f, 17.086f, 11.664f, 16.75f, 11.25f, 16.75f)
            horizontalLineTo(10.684f)
            curveTo(10.373f, 15.004f, 8.996f, 13.627f, 7.25f, 13.316f)
            verticalLineTo(12.75f)
            close()
            moveTo(3.75f, 17.5f)
            curveTo(3.75f, 15.981f, 4.981f, 14.75f, 6.5f, 14.75f)
            curveTo(8.019f, 14.75f, 9.25f, 15.981f, 9.25f, 17.5f)
            curveTo(9.25f, 19.019f, 8.019f, 20.25f, 6.5f, 20.25f)
            curveTo(4.981f, 20.25f, 3.75f, 19.019f, 3.75f, 17.5f)
            close()
            moveTo(7.75f, 17.5f)
            curveTo(7.75f, 18.19f, 7.19f, 18.75f, 6.5f, 18.75f)
            curveTo(5.81f, 18.75f, 5.25f, 18.19f, 5.25f, 17.5f)
            curveTo(5.25f, 16.81f, 5.81f, 16.25f, 6.5f, 16.25f)
            curveTo(7.19f, 16.25f, 7.75f, 16.81f, 7.75f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentTargetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentTarget, contentDescription = null)
    }
}
