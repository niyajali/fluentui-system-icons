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

public val FluentIcons.Filled.DocumentPageBottomLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentPageBottomLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.256f, 16.882f)
            lineTo(9.494f, 15.382f)
            horizontalLineTo(10.975f)
            lineTo(10.738f, 16.882f)
            horizontalLineTo(9.256f)
            close()
            moveTo(17.75f, 2f)
            curveTo(18.941f, 2f, 19.916f, 2.925f, 19.995f, 4.096f)
            lineTo(20f, 4.25f)
            verticalLineTo(19.748f)
            curveTo(20f, 20.939f, 19.075f, 21.914f, 17.904f, 21.993f)
            lineTo(17.75f, 21.998f)
            horizontalLineTo(6.25f)
            curveTo(5.059f, 21.998f, 4.084f, 21.073f, 4.005f, 19.902f)
            lineTo(4f, 19.748f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.059f, 4.925f, 2.084f, 6.096f, 2.005f)
            lineTo(6.25f, 2f)
            horizontalLineTo(17.75f)
            close()
            moveTo(10.395f, 19.042f)
            curveTo(10.331f, 19.452f, 10.61f, 19.836f, 11.019f, 19.901f)
            curveTo(11.428f, 19.965f, 11.812f, 19.686f, 11.877f, 19.277f)
            lineTo(12.019f, 18.382f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 18.382f, 13.5f, 18.046f, 13.5f, 17.632f)
            curveTo(13.5f, 17.218f, 13.164f, 16.882f, 12.75f, 16.882f)
            horizontalLineTo(12.256f)
            lineTo(12.494f, 15.382f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 15.382f, 14f, 15.046f, 14f, 14.632f)
            curveTo(14f, 14.217f, 13.664f, 13.882f, 13.25f, 13.882f)
            horizontalLineTo(12.731f)
            lineTo(12.893f, 12.857f)
            curveTo(12.958f, 12.448f, 12.679f, 12.064f, 12.27f, 11.999f)
            curveTo(11.861f, 11.934f, 11.477f, 12.213f, 11.412f, 12.623f)
            lineTo(11.212f, 13.882f)
            horizontalLineTo(9.731f)
            lineTo(9.893f, 12.857f)
            curveTo(9.958f, 12.448f, 9.679f, 12.064f, 9.27f, 11.999f)
            curveTo(8.861f, 11.934f, 8.477f, 12.213f, 8.412f, 12.623f)
            lineTo(8.213f, 13.882f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 13.882f, 6.5f, 14.217f, 6.5f, 14.632f)
            curveTo(6.5f, 15.046f, 6.836f, 15.382f, 7.25f, 15.382f)
            horizontalLineTo(7.975f)
            lineTo(7.738f, 16.882f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 16.882f, 6f, 17.218f, 6f, 17.632f)
            curveTo(6f, 18.046f, 6.336f, 18.382f, 6.75f, 18.382f)
            horizontalLineTo(7.5f)
            lineTo(7.395f, 19.042f)
            curveTo(7.331f, 19.452f, 7.61f, 19.836f, 8.019f, 19.901f)
            curveTo(8.428f, 19.965f, 8.812f, 19.686f, 8.877f, 19.277f)
            lineTo(9.019f, 18.382f)
            horizontalLineTo(10.5f)
            lineTo(10.395f, 19.042f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentPageBottomLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentPageBottomLeft, contentDescription = null)
    }
}
