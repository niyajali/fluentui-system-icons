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

public val FluentIcons.Regular.SelectAllOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SelectAllOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(15.25f)
            curveTo(3f, 17.045f, 4.455f, 18.5f, 6.25f, 18.5f)
            horizontalLineTo(15.25f)
            curveTo(17.045f, 18.5f, 18.5f, 17.045f, 18.5f, 15.25f)
            verticalLineTo(6.25f)
            curveTo(18.5f, 4.455f, 17.045f, 3f, 15.25f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(15.25f)
            curveTo(16.216f, 4.5f, 17f, 5.284f, 17f, 6.25f)
            verticalLineTo(15.25f)
            curveTo(17f, 16.216f, 16.216f, 17f, 15.25f, 17f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 17f, 4.5f, 16.216f, 4.5f, 15.25f)
            verticalLineTo(6.25f)
            close()
            moveTo(6.011f, 19.5f)
            curveTo(6.588f, 20.402f, 7.599f, 21f, 8.75f, 21f)
            horizontalLineTo(15.75f)
            curveTo(18.649f, 21f, 21f, 18.65f, 21f, 15.75f)
            verticalLineTo(8.75f)
            curveTo(21f, 7.6f, 20.402f, 6.589f, 19.5f, 6.011f)
            verticalLineTo(15.75f)
            curveTo(19.5f, 17.821f, 17.821f, 19.5f, 15.75f, 19.5f)
            horizontalLineTo(8.75f)
            lineTo(8.724f, 19.5f)
            horizontalLineTo(6.011f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SelectAllOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SelectAllOff, contentDescription = null)
    }
}
