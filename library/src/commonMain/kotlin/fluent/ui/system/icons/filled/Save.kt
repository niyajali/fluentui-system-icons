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

public val FluentIcons.Filled.Save: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Save",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.75f, 3f)
            horizontalLineTo(5.75f)
            curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
            horizontalLineTo(6f)
            verticalLineTo(15f)
            curveTo(6f, 13.757f, 7.007f, 12.75f, 8.25f, 12.75f)
            horizontalLineTo(15.75f)
            curveTo(16.993f, 12.75f, 18f, 13.757f, 18f, 15f)
            verticalLineTo(21f)
            horizontalLineTo(18.25f)
            curveTo(19.769f, 21f, 21f, 19.769f, 21f, 18.25f)
            verticalLineTo(8.286f)
            curveTo(21f, 7.424f, 20.658f, 6.597f, 20.048f, 5.987f)
            lineTo(18.013f, 3.952f)
            curveTo(17.411f, 3.351f, 16.599f, 3.009f, 15.75f, 3f)
            verticalLineTo(7.5f)
            curveTo(15.75f, 8.743f, 14.743f, 9.75f, 13.5f, 9.75f)
            horizontalLineTo(9f)
            curveTo(7.757f, 9.75f, 6.75f, 8.743f, 6.75f, 7.5f)
            verticalLineTo(3f)
            close()
            moveTo(14.25f, 3f)
            verticalLineTo(7.5f)
            curveTo(14.25f, 7.914f, 13.914f, 8.25f, 13.5f, 8.25f)
            horizontalLineTo(9f)
            curveTo(8.586f, 8.25f, 8.25f, 7.914f, 8.25f, 7.5f)
            verticalLineTo(3f)
            horizontalLineTo(14.25f)
            close()
            moveTo(16.5f, 21f)
            verticalLineTo(15f)
            curveTo(16.5f, 14.586f, 16.164f, 14.25f, 15.75f, 14.25f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 14.25f, 7.5f, 14.586f, 7.5f, 15f)
            verticalLineTo(21f)
            horizontalLineTo(16.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SavePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Save, contentDescription = null)
    }
}
