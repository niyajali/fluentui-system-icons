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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.Braces: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Braces",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 5.75f)
            curveTo(4.5f, 4.231f, 5.731f, 3f, 7.25f, 3f)
            curveTo(7.664f, 3f, 8f, 3.336f, 8f, 3.75f)
            curveTo(8f, 4.164f, 7.664f, 4.5f, 7.25f, 4.5f)
            curveTo(6.56f, 4.5f, 6f, 5.06f, 6f, 5.75f)
            verticalLineTo(10.059f)
            curveTo(6f, 10.803f, 5.7f, 11.496f, 5.198f, 12f)
            curveTo(5.7f, 12.504f, 6f, 13.197f, 6f, 13.941f)
            verticalLineTo(18.25f)
            curveTo(6f, 18.94f, 6.56f, 19.5f, 7.25f, 19.5f)
            curveTo(7.664f, 19.5f, 8f, 19.836f, 8f, 20.25f)
            curveTo(8f, 20.664f, 7.664f, 21f, 7.25f, 21f)
            curveTo(5.731f, 21f, 4.5f, 19.769f, 4.5f, 18.25f)
            verticalLineTo(13.941f)
            curveTo(4.5f, 13.403f, 4.156f, 12.926f, 3.645f, 12.756f)
            lineTo(3.513f, 12.712f)
            curveTo(3.207f, 12.609f, 3f, 12.323f, 3f, 12f)
            curveTo(3f, 11.677f, 3.207f, 11.391f, 3.513f, 11.288f)
            lineTo(3.645f, 11.244f)
            curveTo(4.156f, 11.074f, 4.5f, 10.597f, 4.5f, 10.059f)
            verticalLineTo(5.75f)
            close()
            moveTo(19.5f, 5.75f)
            curveTo(19.5f, 4.231f, 18.269f, 3f, 16.75f, 3f)
            curveTo(16.336f, 3f, 16f, 3.336f, 16f, 3.75f)
            curveTo(16f, 4.164f, 16.336f, 4.5f, 16.75f, 4.5f)
            curveTo(17.44f, 4.5f, 18f, 5.06f, 18f, 5.75f)
            verticalLineTo(10.059f)
            curveTo(18f, 10.803f, 18.3f, 11.496f, 18.802f, 12f)
            curveTo(18.3f, 12.504f, 18f, 13.197f, 18f, 13.941f)
            verticalLineTo(18.25f)
            curveTo(18f, 18.94f, 17.44f, 19.5f, 16.75f, 19.5f)
            curveTo(16.336f, 19.5f, 16f, 19.836f, 16f, 20.25f)
            curveTo(16f, 20.664f, 16.336f, 21f, 16.75f, 21f)
            curveTo(18.269f, 21f, 19.5f, 19.769f, 19.5f, 18.25f)
            verticalLineTo(13.941f)
            curveTo(19.5f, 13.403f, 19.844f, 12.926f, 20.355f, 12.756f)
            lineTo(20.487f, 12.712f)
            curveTo(20.793f, 12.609f, 21f, 12.323f, 21f, 12f)
            curveTo(21f, 11.677f, 20.793f, 11.391f, 20.487f, 11.288f)
            lineTo(20.355f, 11.244f)
            curveTo(19.844f, 11.074f, 19.5f, 10.597f, 19.5f, 10.059f)
            verticalLineTo(5.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BracesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Braces, contentDescription = null)
    }
}
