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

public val FluentUi.Regular.DocumentOnePageSparkle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentOnePageSparkle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.25f, 11f)
            horizontalLineTo(7.75f)
            curveTo(7.34f, 11f, 7f, 11.34f, 7f, 11.75f)
            curveTo(7f, 12.16f, 7.34f, 12.5f, 7.75f, 12.5f)
            horizontalLineTo(16.25f)
            curveTo(16.66f, 12.5f, 17f, 12.16f, 17f, 11.75f)
            curveTo(17f, 11.34f, 16.66f, 11f, 16.25f, 11f)
            close()
            moveTo(16.25f, 15.5f)
            horizontalLineTo(7.75f)
            curveTo(7.34f, 15.5f, 7f, 15.84f, 7f, 16.25f)
            curveTo(7f, 16.66f, 7.34f, 17f, 7.75f, 17f)
            horizontalLineTo(16.25f)
            curveTo(16.66f, 17f, 17f, 16.66f, 17f, 16.25f)
            curveTo(17f, 15.84f, 16.66f, 15.5f, 16.25f, 15.5f)
            close()
            moveTo(7f, 7.25f)
            curveTo(7f, 7.66f, 7.34f, 8f, 7.75f, 8f)
            horizontalLineTo(15.2f)
            lineTo(15.11f, 7.72f)
            curveTo(15.06f, 7.58f, 14.99f, 7.45f, 14.9f, 7.33f)
            curveTo(14.86f, 7.28f, 14.83f, 7.24f, 14.79f, 7.2f)
            curveTo(14.64f, 7.05f, 14.46f, 6.94f, 14.27f, 6.88f)
            lineTo(13.1f, 6.5f)
            horizontalLineTo(7.75f)
            curveTo(7.34f, 6.5f, 7f, 6.84f, 7f, 7.25f)
            close()
            moveTo(19.8f, 13.29f)
            lineTo(19.54f, 12.5f)
            lineTo(18.74f, 12.21f)
            curveTo(18.65f, 12.18f, 18.58f, 12.13f, 18.5f, 12.09f)
            verticalLineTo(19.75f)
            curveTo(18.5f, 20.16f, 18.16f, 20.5f, 17.75f, 20.5f)
            horizontalLineTo(6.25f)
            curveTo(5.84f, 20.5f, 5.5f, 20.16f, 5.5f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(5.5f, 3.84f, 5.84f, 3.5f, 6.25f, 3.5f)
            horizontalLineTo(11.78f)
            curveTo(11.81f, 3.44f, 11.83f, 3.37f, 11.87f, 3.31f)
            curveTo(12.11f, 2.97f, 12.45f, 2.71f, 12.86f, 2.57f)
            lineTo(14.27f, 2.11f)
            curveTo(14.34f, 2.08f, 14.42f, 2.04f, 14.49f, 2f)
            horizontalLineTo(6.25f)
            curveTo(5.01f, 2f, 4f, 3.01f, 4f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(4f, 20.99f, 5.01f, 22f, 6.25f, 22f)
            horizontalLineTo(17.75f)
            curveTo(18.99f, 22f, 20f, 20.99f, 20f, 19.75f)
            verticalLineTo(13.67f)
            curveTo(19.92f, 13.55f, 19.85f, 13.43f, 19.8f, 13.29f)
            close()
            moveTo(15.85f, 6.15f)
            curveTo(15.93f, 6.23f, 16.01f, 6.32f, 16.08f, 6.42f)
            curveTo(16.28f, 6.67f, 16.43f, 6.96f, 16.53f, 7.27f)
            lineTo(16.98f, 8.65f)
            curveTo(17.02f, 8.76f, 17.09f, 8.85f, 17.18f, 8.91f)
            curveTo(17.27f, 8.98f, 17.38f, 9.01f, 17.49f, 9.01f)
            curveTo(17.6f, 9.01f, 17.71f, 8.98f, 17.8f, 8.91f)
            curveTo(17.88f, 8.85f, 17.95f, 8.77f, 17.99f, 8.68f)
            verticalLineTo(8.65f)
            lineTo(18.45f, 7.27f)
            curveTo(18.59f, 6.85f, 18.82f, 6.47f, 19.14f, 6.16f)
            curveTo(19.45f, 5.85f, 19.83f, 5.61f, 20.25f, 5.47f)
            lineTo(21.63f, 5.02f)
            curveTo(21.74f, 4.98f, 21.83f, 4.91f, 21.89f, 4.82f)
            curveTo(21.96f, 4.73f, 21.99f, 4.62f, 21.99f, 4.51f)
            curveTo(21.99f, 4.4f, 21.96f, 4.29f, 21.89f, 4.2f)
            curveTo(21.82f, 4.11f, 21.73f, 4.04f, 21.63f, 4f)
            horizontalLineTo(21.6f)
            lineTo(20.22f, 3.55f)
            curveTo(19.8f, 3.41f, 19.42f, 3.18f, 19.11f, 2.86f)
            curveTo(18.8f, 2.55f, 18.56f, 2.17f, 18.42f, 1.75f)
            lineTo(17.97f, 0.37f)
            curveTo(17.93f, 0.26f, 17.86f, 0.17f, 17.77f, 0.11f)
            curveTo(17.68f, 0.05f, 17.57f, 0.01f, 17.46f, 0.01f)
            curveTo(17.35f, 0.01f, 17.24f, 0.04f, 17.15f, 0.11f)
            curveTo(17.06f, 0.17f, 16.99f, 0.27f, 16.95f, 0.37f)
            lineTo(16.5f, 1.75f)
            verticalLineTo(1.78f)
            curveTo(16.35f, 2.18f, 16.12f, 2.55f, 15.83f, 2.85f)
            curveTo(15.52f, 3.16f, 15.15f, 3.4f, 14.73f, 3.54f)
            lineTo(13.35f, 3.99f)
            curveTo(13.24f, 4.03f, 13.15f, 4.1f, 13.09f, 4.19f)
            curveTo(13.02f, 4.28f, 12.99f, 4.39f, 12.99f, 4.5f)
            curveTo(12.99f, 4.61f, 13.02f, 4.72f, 13.09f, 4.81f)
            curveTo(13.15f, 4.9f, 13.25f, 4.97f, 13.35f, 5.01f)
            lineTo(14.73f, 5.46f)
            curveTo(15.15f, 5.6f, 15.53f, 5.84f, 15.84f, 6.15f)
            horizontalLineTo(15.85f)
            close()
            moveTo(23.78f, 10.22f)
            curveTo(23.844f, 10.22f, 23.91f, 10.281f, 23.95f, 10.33f)
            curveTo(23.99f, 10.38f, 24f, 10.44f, 24f, 10.5f)
            curveTo(24f, 10.56f, 23.99f, 10.62f, 23.95f, 10.67f)
            curveTo(23.91f, 10.72f, 23.86f, 10.76f, 23.8f, 10.78f)
            lineTo(23.03f, 11.03f)
            curveTo(22.8f, 11.11f, 22.59f, 11.24f, 22.41f, 11.41f)
            curveTo(22.24f, 11.58f, 22.11f, 11.79f, 22.03f, 12.03f)
            lineTo(21.78f, 12.79f)
            curveTo(21.76f, 12.85f, 21.72f, 12.9f, 21.67f, 12.94f)
            curveTo(21.62f, 12.98f, 21.56f, 13f, 21.5f, 13f)
            curveTo(21.44f, 13f, 21.38f, 12.98f, 21.33f, 12.94f)
            curveTo(21.28f, 12.9f, 21.24f, 12.85f, 21.22f, 12.79f)
            lineTo(20.97f, 12.03f)
            curveTo(20.89f, 11.8f, 20.76f, 11.58f, 20.59f, 11.41f)
            curveTo(20.42f, 11.24f, 20.2f, 11.1f, 19.97f, 11.03f)
            lineTo(19.2f, 10.78f)
            curveTo(19.14f, 10.76f, 19.09f, 10.72f, 19.05f, 10.67f)
            curveTo(19.01f, 10.62f, 18.99f, 10.56f, 18.99f, 10.5f)
            curveTo(18.99f, 10.44f, 19.01f, 10.38f, 19.05f, 10.33f)
            curveTo(19.09f, 10.28f, 19.14f, 10.24f, 19.2f, 10.22f)
            lineTo(19.97f, 9.97f)
            curveTo(20.2f, 9.89f, 20.41f, 9.76f, 20.58f, 9.59f)
            curveTo(20.75f, 9.42f, 20.88f, 9.21f, 20.95f, 8.98f)
            lineTo(21.2f, 8.22f)
            curveTo(21.22f, 8.16f, 21.26f, 8.11f, 21.31f, 8.07f)
            curveTo(21.36f, 8.03f, 21.42f, 8.01f, 21.48f, 8.01f)
            curveTo(21.54f, 8.01f, 21.6f, 8.03f, 21.65f, 8.07f)
            curveTo(21.7f, 8.11f, 21.74f, 8.16f, 21.76f, 8.22f)
            lineTo(22.01f, 8.98f)
            curveTo(22.09f, 9.21f, 22.22f, 9.42f, 22.39f, 9.6f)
            curveTo(22.56f, 9.77f, 22.77f, 9.9f, 23.01f, 9.98f)
            lineTo(23.78f, 10.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentOnePageSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentOnePageSparkle, contentDescription = null)
    }
}
