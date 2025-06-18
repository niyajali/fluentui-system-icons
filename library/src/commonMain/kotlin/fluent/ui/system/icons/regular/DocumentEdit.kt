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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.DocumentEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3.5f)
            curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
            horizontalLineTo(10.029f)
            curveTo(9.922f, 21.048f, 10.038f, 21.573f, 10.301f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(12.336f)
            curveTo(12.8f, 2f, 13.245f, 2.184f, 13.573f, 2.513f)
            lineTo(19.487f, 8.427f)
            curveTo(19.816f, 8.755f, 20f, 9.2f, 20f, 9.664f)
            verticalLineTo(10f)
            horizontalLineTo(19.87f)
            curveTo(19.759f, 9.994f, 19.648f, 9.994f, 19.538f, 10f)
            horizontalLineTo(14f)
            curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
            verticalLineTo(3.5f)
            horizontalLineTo(6.25f)
            close()
            moveTo(13.5f, 4.561f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(17.439f)
            lineTo(13.5f, 4.561f)
            close()
            moveTo(19.713f, 11f)
            horizontalLineTo(19.715f)
            curveTo(20.3f, 11f, 20.885f, 11.223f, 21.33f, 11.67f)
            curveTo(22.223f, 12.562f, 22.223f, 14.009f, 21.33f, 14.902f)
            lineTo(15.428f, 20.804f)
            curveTo(15.084f, 21.149f, 14.653f, 21.393f, 14.181f, 21.511f)
            lineTo(12.35f, 21.968f)
            curveTo(11.554f, 22.167f, 10.833f, 21.446f, 11.032f, 20.65f)
            lineTo(11.489f, 18.819f)
            curveTo(11.607f, 18.347f, 11.851f, 17.916f, 12.196f, 17.572f)
            lineTo(18.098f, 11.67f)
            curveTo(18.544f, 11.223f, 19.129f, 11f, 19.713f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentEdit, contentDescription = null)
    }
}
