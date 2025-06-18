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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.TabAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.TabAdd",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineTo(24.5f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(16.292f)
            curveTo(28.686f, 16.01f, 28.352f, 15.751f, 28f, 15.516f)
            verticalLineTo(7.5f)
            curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineTo(24.5f)
            curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
            horizontalLineTo(15.516f)
            curveTo(15.751f, 28.352f, 16.01f, 28.686f, 16.292f, 29f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(7.5f)
            close()
            moveTo(23f, 30.5f)
            curveTo(27.142f, 30.5f, 30.5f, 27.142f, 30.5f, 23f)
            curveTo(30.5f, 18.858f, 27.142f, 15.5f, 23f, 15.5f)
            curveTo(18.858f, 15.5f, 15.5f, 18.858f, 15.5f, 23f)
            curveTo(15.5f, 27.142f, 18.858f, 30.5f, 23f, 30.5f)
            close()
            moveTo(24f, 18.25f)
            verticalLineTo(22f)
            horizontalLineTo(27.75f)
            curveTo(28.164f, 22f, 28.5f, 22.336f, 28.5f, 22.75f)
            curveTo(28.5f, 23.164f, 28.164f, 23.5f, 27.75f, 23.5f)
            horizontalLineTo(24f)
            verticalLineTo(27.25f)
            curveTo(24f, 27.664f, 23.664f, 28f, 23.25f, 28f)
            curveTo(22.836f, 28f, 22.5f, 27.664f, 22.5f, 27.25f)
            verticalLineTo(23.5f)
            horizontalLineTo(18.75f)
            curveTo(18.336f, 23.5f, 18f, 23.164f, 18f, 22.75f)
            curveTo(18f, 22.336f, 18.336f, 22f, 18.75f, 22f)
            horizontalLineTo(22.5f)
            verticalLineTo(18.25f)
            curveTo(22.5f, 17.836f, 22.836f, 17.5f, 23.25f, 17.5f)
            curveTo(23.664f, 17.5f, 24f, 17.836f, 24f, 18.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TabAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.TabAdd, contentDescription = null)
    }
}
