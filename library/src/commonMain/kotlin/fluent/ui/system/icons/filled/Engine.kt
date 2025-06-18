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

public val FluentIcons.Filled.Engine: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Engine",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.75f, 3f)
            curveTo(10.164f, 3f, 10.5f, 3.336f, 10.5f, 3.75f)
            verticalLineTo(5f)
            horizontalLineTo(12.5f)
            verticalLineTo(3.75f)
            curveTo(12.5f, 3.336f, 12.836f, 3f, 13.25f, 3f)
            curveTo(13.664f, 3f, 14f, 3.336f, 14f, 3.75f)
            verticalLineTo(5f)
            horizontalLineTo(16.75f)
            curveTo(17.057f, 5f, 17.333f, 5.187f, 17.446f, 5.471f)
            lineTo(18.258f, 7.5f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 7.5f, 22f, 8.731f, 22f, 10.25f)
            verticalLineTo(15.75f)
            curveTo(22f, 17.269f, 20.769f, 18.5f, 19.25f, 18.5f)
            horizontalLineTo(18.258f)
            lineTo(17.446f, 20.528f)
            curveTo(17.333f, 20.813f, 17.057f, 21f, 16.75f, 21f)
            horizontalLineTo(9.25f)
            curveTo(9.042f, 21f, 8.844f, 20.914f, 8.702f, 20.762f)
            lineTo(5.74f, 17.588f)
            curveTo(5.264f, 17.079f, 5f, 16.408f, 5f, 15.712f)
            lineTo(5f, 12.5f)
            horizontalLineTo(3.5f)
            verticalLineTo(16.25f)
            curveTo(3.5f, 16.664f, 3.164f, 17f, 2.75f, 17f)
            curveTo(2.336f, 17f, 2f, 16.664f, 2f, 16.25f)
            verticalLineTo(7.75f)
            curveTo(2f, 7.336f, 2.336f, 7f, 2.75f, 7f)
            curveTo(3.164f, 7f, 3.5f, 7.336f, 3.5f, 7.75f)
            verticalLineTo(11f)
            horizontalLineTo(5f)
            verticalLineTo(7.75f)
            curveTo(5f, 6.231f, 6.231f, 5f, 7.75f, 5f)
            horizontalLineTo(9f)
            verticalLineTo(3.75f)
            curveTo(9f, 3.336f, 9.336f, 3f, 9.75f, 3f)
            close()
            moveTo(10.5f, 9.75f)
            curveTo(10.5f, 9.336f, 10.164f, 9f, 9.75f, 9f)
            curveTo(9.336f, 9f, 9f, 9.336f, 9f, 9.75f)
            verticalLineTo(12.25f)
            curveTo(9f, 13.769f, 10.231f, 15f, 11.75f, 15f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 15f, 19f, 14.664f, 19f, 14.25f)
            curveTo(19f, 13.836f, 18.664f, 13.5f, 18.25f, 13.5f)
            horizontalLineTo(14f)
            verticalLineTo(9.75f)
            curveTo(14f, 9.336f, 13.664f, 9f, 13.25f, 9f)
            curveTo(12.836f, 9f, 12.5f, 9.336f, 12.5f, 9.75f)
            verticalLineTo(13.5f)
            horizontalLineTo(11.75f)
            curveTo(11.06f, 13.5f, 10.5f, 12.94f, 10.5f, 12.25f)
            verticalLineTo(9.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EnginePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Engine, contentDescription = null)
    }
}
