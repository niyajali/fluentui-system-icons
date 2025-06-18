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

public val FluentIcons.Regular.SaveEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SaveEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.75f, 3f)
            curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
            horizontalLineTo(9.999f)
            curveTo(9.991f, 20.808f, 10.011f, 20.609f, 10.061f, 20.407f)
            lineTo(10.288f, 19.5f)
            horizontalLineTo(7.5f)
            verticalLineTo(14.25f)
            curveTo(7.5f, 13.836f, 7.836f, 13.5f, 8.25f, 13.5f)
            horizontalLineTo(14.853f)
            lineTo(16.288f, 12.065f)
            curveTo(16.116f, 12.023f, 15.936f, 12f, 15.75f, 12f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 12f, 6f, 13.007f, 6f, 14.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(5.75f)
            curveTo(5.06f, 19.5f, 4.5f, 18.94f, 4.5f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(4.5f, 5.06f, 5.06f, 4.5f, 5.75f, 4.5f)
            horizontalLineTo(7f)
            verticalLineTo(7.25f)
            curveTo(7f, 8.493f, 8.007f, 9.5f, 9.25f, 9.5f)
            horizontalLineTo(13.75f)
            curveTo(14.993f, 9.5f, 16f, 8.493f, 16f, 7.25f)
            verticalLineTo(4.523f)
            curveTo(16.358f, 4.583f, 16.692f, 4.752f, 16.952f, 5.013f)
            lineTo(18.987f, 7.048f)
            curveTo(19.316f, 7.376f, 19.5f, 7.821f, 19.5f, 8.286f)
            verticalLineTo(10.007f)
            curveTo(19.571f, 10.002f, 19.642f, 10f, 19.713f, 10f)
            horizontalLineTo(19.715f)
            curveTo(20.152f, 10f, 20.59f, 10.087f, 21f, 10.262f)
            verticalLineTo(8.286f)
            curveTo(21f, 7.424f, 20.658f, 6.597f, 20.048f, 5.987f)
            lineTo(18.013f, 3.952f)
            curveTo(17.403f, 3.342f, 16.576f, 3f, 15.715f, 3f)
            horizontalLineTo(5.75f)
            close()
            moveTo(8.5f, 7.25f)
            verticalLineTo(4.5f)
            horizontalLineTo(14.5f)
            verticalLineTo(7.25f)
            curveTo(14.5f, 7.664f, 14.164f, 8f, 13.75f, 8f)
            horizontalLineTo(9.25f)
            curveTo(8.836f, 8f, 8.5f, 7.664f, 8.5f, 7.25f)
            close()
            moveTo(19.715f, 11f)
            horizontalLineTo(19.713f)
            curveTo(19.128f, 11f, 18.544f, 11.223f, 18.098f, 11.67f)
            lineTo(12.196f, 17.572f)
            curveTo(11.851f, 17.916f, 11.607f, 18.347f, 11.489f, 18.819f)
            lineTo(11.031f, 20.65f)
            curveTo(10.833f, 21.446f, 11.554f, 22.167f, 12.35f, 21.968f)
            lineTo(14.18f, 21.511f)
            curveTo(14.653f, 21.393f, 15.084f, 21.149f, 15.428f, 20.804f)
            lineTo(21.33f, 14.902f)
            curveTo(22.223f, 14.009f, 22.223f, 12.562f, 21.33f, 11.67f)
            curveTo(20.884f, 11.223f, 20.3f, 11f, 19.715f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SaveEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SaveEdit, contentDescription = null)
    }
}
